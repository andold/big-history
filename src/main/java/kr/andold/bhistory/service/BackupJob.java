package kr.andold.bhistory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.bhistory.ApplicationContextProvider;
import kr.andold.bhistory.entity.BigHistoryEntity;
import kr.andold.utils.Utility;
import kr.andold.utils.job.JobInterface;
import kr.andold.utils.job.STATUS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class BackupJob implements JobInterface {
	@Builder.Default @Getter @Setter private Long timeout = 300L;	//	TimeUnit.SECONDS
	@Getter @Setter private String userDataPath;

	@Autowired private BigHistoryService service;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		BackupJob that = (BackupJob) ApplicationContextProvider.getBean(BackupJob.class);
		that.setTimeout(getTimeout());
		STATUS result = that.main();
		
		log.debug("{} 『#{}』 call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private STATUS main() throws Exception {
		//	calendar.ics
		List<BigHistoryEntity> histories = service.search(null);
		String text = Utility.toStringJsonLine(histories);
		String filename = String.format("%s/bhistory.json", userDataPath);
		Utility.write(filename, text);
		log.debug("{} backup() - 『{}』『{}』", Utility.indentMiddle(), filename, Utility.ellipsis(text, 32, 32));
		return null;
	}

}
