package com.chenli.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.chenli.springbootquickstart.dao")
@SpringBootApplication
public class SpringbootQuickStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuickStartApplication.class, args);
    }

}
