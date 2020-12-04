package com.han;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka—server
 */
@SpringBootApplication
@EnableEurekaServer  //作为eureka server启动
public class EurekaServerApplication
{
    public static void main( String[] args ){
        SpringApplication.run(EurekaServerApplication.class , args);
    }

}
