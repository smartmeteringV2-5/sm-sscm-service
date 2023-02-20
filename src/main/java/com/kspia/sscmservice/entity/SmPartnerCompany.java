package com.kspia.sscmservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "smPartnerCompany")

public class SmPartnerCompany implements Serializable {

    @Id
    @NotNull
    @Column(name = "companySid")
    private Long company_sid;


    @Column(name = "createdUser")
    @NotNull
    private String created_user;

    @Column(name = "createdDate")
    @NotNull
    private Date created_date;

    @Column(name = "lastModifiedUser")
    private String last_modified_user;

    @Column(name = "lastModifiedDate")
    private Date last_modified_date;

    @NotNull
    private String brn;

    @Column(name = "cellNo")
    private String cell_no;

    @Column(name = "companyAddr")
    private String company_addr;

    @Column(name = "companyDetailAddr")
    private String company_detail_addr;

    @Column(name = "companyNm")
    @NotNull
    private String company_nm;

    @Column(name = "companyTellNo")
    private String company_tell_no;

    @Column(name = "managerNm")
    private String manager_nm;

    @Column(name = "tellNo")
    private String tell_no;








}
