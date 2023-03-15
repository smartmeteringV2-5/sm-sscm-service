package com.kspia.sscmservice.dto.response;
import com.kspia.sscmservice.dto.request.PageRequestVo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserManageDto extends PageRequestVo {

	private String email;
	private String name;
	private String department;
	private String position;
	private String roleCode;
	private String city;
	private String password;
	private String passwordCompare;
	private boolean activated;
	private List<String> assignedRoles;
	private List<String> bookMarkList;
	Long groupSid;
}
