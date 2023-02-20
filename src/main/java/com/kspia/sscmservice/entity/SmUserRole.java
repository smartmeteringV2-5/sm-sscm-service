package com.kspia.sscmservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "smUserRole")

public class SmUserRole implements Serializable {

    @NotNull
    private String email;

    @Id
    @Column(name = "roleSid")
    @NotNull
    private String role_sid;

    @Column(name = "roleNm")
    private String role_nm;



}
