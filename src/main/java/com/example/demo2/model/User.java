package com.example.demo2.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {


    private String userId;

    private Integer deptId;

    private String userName;

    private String password;

    private String realName;

    private String phone;

    private String mobile;

    private String email;

    private Date createTime;

    private Integer userStatus;

}