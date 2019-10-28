package com.chenli.springbootquickstart.domain.entity.user;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String name;

    private Integer age;

    /**
     * 0:女，1:男
     */
    private Integer sex;

}