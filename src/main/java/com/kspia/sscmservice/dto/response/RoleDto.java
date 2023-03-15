package com.kspia.sscmservice.dto.response;
import com.kspia.sscmservice.dto.request.PageRequestVo;
import lombok.Data;

import java.util.List;

@Data
public class RoleDto extends PageRequestVo {
	
	private String roleCode;
	private String roleName;
	private String useYn;
	private Boolean activated;
	private List<String> assignedPrivileges;
	
	
}
