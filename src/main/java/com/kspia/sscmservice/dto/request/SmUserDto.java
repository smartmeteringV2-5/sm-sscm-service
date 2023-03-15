package com.kspia.sscmservice.dto.request;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @since 2023. 03. 09
 * @author jung
 *
 * @Discript
 * ---------------------------------------------------
 * 개요 : SmUserDto작성
 * ---------------------------------------------------
 * @EditHIstory
 * 개정이력
 * 2023-03.09 jung: 최초 작성
 * 2023-03.09 jung : SmUserDto작성
 */

@Data
@NoArgsConstructor
public class SmUserDto {

	private String email;
	private String name;
	private String department;
	private String departmentSubCode;
	private String departmentName;
	private String deptCode;
	private String position;
	private Boolean activated;
	private Boolean accessWeb;
	private Boolean accessMobile;
	private List<String> assignedRoles;
	private String latestUpdater;
	private String ipAddress;
	private Integer loginCount;
	private Long groupSid;
	private String geoX;
	private String geoY;
	private String zoom;
	private String dashboardDefaultSelect;
	private String timeLimitCd;
	private String password;
	private String passwordCompare;
	private List<String> bookMarkList;

}
