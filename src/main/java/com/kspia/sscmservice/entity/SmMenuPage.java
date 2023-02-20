package com.kspia.sscmservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "smMenuPage")

public class SmMenuPage implements Serializable {

    @Id
    @NotNull
    @Column(name = "menuId")
    private String menu_id;

    @Column(name = "pageId")
    private String page_id;

}
