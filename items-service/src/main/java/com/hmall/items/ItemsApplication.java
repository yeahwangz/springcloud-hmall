package com.hmall.items;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hmall.items.mapper")
@SpringBootApplication
public class ItemsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemsApplication.class, args);
    }
}