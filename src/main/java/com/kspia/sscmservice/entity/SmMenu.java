package com.kspia.sscmservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "smMenu")

public class SmMenu implements Serializable {

    @OneToMany
    @JoinColumn(name = "menuId")
    private Set<SmMenuPage> smMenuPages;

    @OneToMany
    @JoinColumn(name = "menuId")
    private Set<SmMenuRole> smMenuRoles;

    @Id
    @NotNull
    @Column(name = "menuId")
    private String menu_id;

    @Column(name = "menuLevel")
    private Integer menu_level;

    @Column(name = "menuNm")
    private String menu_nm;

    @Column(name = "orderIdx")
    private Integer order_idx;

    @Column(name = "parentId")
    private String parent_id;

}
