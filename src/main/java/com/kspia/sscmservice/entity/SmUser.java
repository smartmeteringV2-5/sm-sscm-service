package com.kspia.sscmservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "smUser")

public class SmUser implements Serializable {

    @OneToMany
    @JoinColumn(name = "email")
    private Set<SmUserRole> smUserRoles;

    @Id
    @NotNull
    private String email;

    @Column(name = "createdUser")
    @NotNull
    private String created_user;

    @Column(name = "createdDate")
    @NotNull
    private Date created_date;

    @NotNull
    private String dept;

    @Column(name = "userNm")
    @NotNull
    private String user_nm;

    @NotNull
    private String passwd;

    private String position;

    @Column(name = "updateDate")
    private Date update_date;

    @Column(name = "updateUser")
    private String update_user;








}
