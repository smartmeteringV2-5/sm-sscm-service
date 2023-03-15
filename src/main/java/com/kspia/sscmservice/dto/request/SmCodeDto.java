package com.kspia.sscmservice.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @since 2023. 03. 09
 * @author jung
 *
 * @Discript
 * ---------------------------------------------------
 * 개요 : SmCodeDto 작성
 * ---------------------------------------------------
 * @EditHIstory
 * 개정이력
 * 2023-03.09 jung: 최초 작성
 * 2023-03.09 jung : SmCodeDto 작성
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class SmCodeDto {

	//코드
	private String code;
	//코드이름
	private String codeName;
	//코드 설명
	private String description;
	//상위 코드
	private String parentCode;
	//코드 레벨
	private int level;
	//표시 순서
	private int displayOrder;
	//사용여부
	private Boolean useYn;
	//부 코드
	private String subCode;
	//지자체 번호
	private Long groupSid;

}
