package kr.andold.bhistory;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import kr.andold.bhistory.service.BackupJob;
import kr.andold.bhistory.service.JobService;
import kr.andold.bhistory.service.ZookeeperClient;
import kr.andold.utils.Utility;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableScheduling
public class ScheduledTasks {
	@Autowired private JobService jobService;
	@Autowired private ZookeeperClient zookeeperClient;

	@Getter private static String userDataPath;
	@Value("${user.data.path}")
	public void setUserDataPath(String value) {
		log.info("{} setUserDataPath({})", Utility.indentMiddle(), value);
		userDataPath = value;
		File directory = new File(value);
		if (!directory.exists()) {
			log.info("{} NOT EXIST PATH setDataPath({})", Utility.indentMiddle(), value);
			directory.mkdir();
		}
	}

	@Scheduled(initialDelay = 1000 * 10, fixedDelay = Long.MAX_VALUE)
	public void once() {
		log.info("{} once()", Utility.indentStart());

		zookeeperClient.run();

		log.info("{} once()", Utility.indentEnd());
	}

	// 1초쉬고
	@Scheduled(initialDelay = 1000 * 16, fixedDelay = 1000)
	public void secondly() {
		log.trace("{} secondly()", Utility.indentStart());
		long started = System.currentTimeMillis();

		jobService.run();

		log.trace("{} secondly() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 매분
	@Scheduled(cron = "0 * * * * *")
	public void minutely() {
		log.debug("{} minutely()", Utility.indentStart());

		jobService.status(zookeeperClient.status(true));

		log.debug("{} minutely()", Utility.indentEnd());
	}

	// 매일
	@Scheduled(cron = "0 0 0 * * *")
	public void daily() {
		if (zookeeperClient.isMaster()) {
			JobService.getQueue2().offer(BackupJob.builder().userDataPath(getUserDataPath()).build());
		}
	}

}
