package com.kspia.sscmservice.dto.response;


import lombok.Builder;
import lombok.Data;

import java.util.List;

/**

 * ------------------------
 * 개요 : 메뉴에 대한 권한 설정 DTO
 * ------------------------

 */
@Data
public class SmMenuRoleDto {
	
	//메뉴 식별자
	private String menuId;

	//권한 그룹
	private List<String> assignedRoles;

	public SmMenuRoleDto() {}
	
	@Builder
	public SmMenuRoleDto(String menuId, List<String> assignedRoles) {
		this.menuId = menuId;
		this.assignedRoles = assignedRoles;
	}
}
