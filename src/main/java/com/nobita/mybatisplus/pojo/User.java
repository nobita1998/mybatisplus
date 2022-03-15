package com.nobita.mybatisplus.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String email;
}
