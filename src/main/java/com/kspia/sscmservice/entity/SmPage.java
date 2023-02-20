package com.kspia.sscmservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "smPage")

public class SmPage implements Serializable {

    @OneToMany
    @JoinColumn(name = "pageId")
    private Set<SmMenuPage> smMenuPages;

    @Id
    @NotNull
    @Column(name = "pageId")
    private String page_id;

    @NotNull
    private Integer activated;

    @Column(name = "pageDesc")
    private String page_desc;

    @Column(name = "pageNm")
    private String page_nm;



}
