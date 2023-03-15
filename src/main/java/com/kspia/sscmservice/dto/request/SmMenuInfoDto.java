package com.kspia.sscmservice.dto.request;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SmMenuInfoDto {

	//메뉴 SID
	private String menuId;

	//상위메뉴 SID
	private String parentId;

	//메뉴이름
	private String menuName;

	//메뉴단계
	private Integer menuLevel;

	//메뉴순서
	private Integer orderIndex;

	//화면이름
	private String pageName;

	//화면설명
	private String pageDescription;

	//활성화 여부
	private Integer activated;

	//메뉴 리스트
	private List<SmMenuInfoDto> childMenuItemList;

	@SuppressWarnings("rawtypes")
	// 메뉴클래스
	private Class clazz;


	@Builder
	public SmMenuInfoDto(String menuId, String parentId, String menuName, Integer menuLevel, Integer orderIndex, String pageName, String pageDescription, Integer activated, List<SmMenuInfoDto> childMenuItemList) {
		this.menuId = menuId;
		this.parentId = parentId;
		this.menuName = menuName;
		this.menuLevel = menuLevel;
		this.orderIndex = orderIndex;
		this.pageName = pageName;
		this.pageDescription = pageDescription;
		this.activated = activated;
		this.childMenuItemList = childMenuItemList;
	}
}
