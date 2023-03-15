package com.kspia.sscmservice.dto.request;


import lombok.Data;

/**
 * ------------------------
 * 개요 : 관리 마당 > 권한 관리의 조회조건 DTO 객체
 * ------------------------
 */

@Data
public class SmPrivilegeSearchDto{

	//권한그룹 코드
	private String roleCode;

	//권한 코드
	private String privilegeCode;

	//권한 이름
	private String privilegeName;

}
