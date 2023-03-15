package com.kspia.sscmservice.dto.request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @since 2023. 03. 09
 * @author jung
 *
 * @Discript
 * ---------------------------------------------------
 * 개요 : SmPrivilegeDto 작성
 * ---------------------------------------------------
 * @EditHIstory
 * 개정이력
 * 2023-03.09 jung: 최초 작성
 * 2023-03.09 jung : SmPrivilegeDto 작성
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmPrivilegeDto {

	//권한코드
	private String privilegeCode;
	//권한명
	private String privilegeName;
	//소속 권한그룹 코드 목록
	private List<String> assignedRoles;

}
