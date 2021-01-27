package com.weixia.xblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class XBlogManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XBlogManagerApplication.class,args);
    }
}
