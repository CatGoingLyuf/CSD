package com.lyuf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyuf.mapper")
public class CsdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsdApplication.class, args);
    }

}
