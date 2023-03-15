package com.kspia.sscmservice.dto.response;
import com.kspia.sscmservice.dto.request.PageRequestVo;
import lombok.Data;

@Data
public class AccesshistoryDto extends PageRequestVo {
	private String fromDate;// - 시작일
	private String toDate;// - 종료일
	private String name;// - 성명
	private String department;// - 부서명
	private String ipAddress;
	
}
