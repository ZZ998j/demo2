package com.example.demo2.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Data
@Table(name = "base_user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
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

    //备注
    @Transient
    private String note;


}