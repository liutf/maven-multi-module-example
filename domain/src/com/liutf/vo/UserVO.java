package com.liutf.vo;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class UserVO {

    private String name;
    private int age;

}
