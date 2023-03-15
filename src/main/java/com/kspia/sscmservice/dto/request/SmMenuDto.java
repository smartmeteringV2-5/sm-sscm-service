package com.kspia.sscmservice.dto.request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @since 2023. 03. 09
 * @author jung
 *
 * @Discript
 * ---------------------------------------------------
 * 개요 : SmMenuDto 작성
 * ---------------------------------------------------
 * @EditHIstory
 * 개정이력
 * 2023-03.09 jung: 최초 작성
 * 2023-03.09 jung : SmMenuDto 작성
 */
@Data
@NoArgsConstructor
public class SmMenuDto {

	//메뉴식별자
	private String menuId;
	//상위메뉴 식별자
	private String parentId;
	//메뉴명
	private String menuName;
	//메뉴레벨
	private Integer menuLevel;
	//정렬순서
	private Integer orderIndex;

}
