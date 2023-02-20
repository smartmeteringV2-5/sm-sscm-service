package com.kspia.sscmservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "smCode")

public class SmCode implements Serializable {
    @Id
    @NotNull
    private String cd;

    @Column(name = "cdNm")
    private String cd_nm;

    @Column(name = "delYn")
    private String del_yn;

    @Column(name = "cdDesc")
    private String cd_desc;

    @Column(name = "displayOrder")
    private Integer display_order;

    private Byte level;

    @Column(name = "parentCd")
    private String parent_cd;

    @Column(name = "useYn")
    private String use_yn;


}
