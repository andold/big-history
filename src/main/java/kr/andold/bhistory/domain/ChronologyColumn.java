package kr.andold.bhistory.domain;

import kr.andold.bhistory.entity.BigHistoryEntity;
import lombok.Getter;
import lombok.Setter;

public class ChronologyColumn {
	@Getter
	@Setter
	private Integer rowspan;

	@Getter
	@Setter
	private Integer colspan;

	@Getter
	@Setter
	private BigHistoryEntity bigHistory;

}
