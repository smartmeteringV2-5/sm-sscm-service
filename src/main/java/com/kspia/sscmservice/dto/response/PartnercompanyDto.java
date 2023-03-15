package com.kspia.sscmservice.dto.response;
import com.kspia.sscmservice.dto.request.PageRequestVo;
import lombok.Data;

@Data
public class PartnercompanyDto extends PageRequestVo {
	private String companySid;
	private String brn;
	private String companyNm;
	private String companyTellNo;
	private String tellNo;
	private String managerNm;
	private String companyAddr;

	private String meterYN;
	private String modemYN;
}
