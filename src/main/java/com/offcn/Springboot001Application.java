package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot001Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot001Application.class, args);
        //添加分支语句
        System.out.println("添加一个分支语句");
    }
    //注释,2019.9.19
    public void testBranch001(){
        System.out.println("添加分支语句001");
    }

}
