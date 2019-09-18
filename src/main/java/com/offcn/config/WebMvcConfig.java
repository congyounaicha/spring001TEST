package com.offcn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 自定义静态资源 配置类
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有的D:\0422Fourth\LunBoTu 的资源映射到 /mypic/** 路径下(注意末尾的斜杠!!)
        //registry.addResourceHandler("/mypic/**").addResourceLocations("file:D:\\0422Fourth\\LunBoTu\\");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/")
                .resourceChain(true);//加入 resourceChain 属性，不然还是去除了版本时路径找不到的
    }
}
