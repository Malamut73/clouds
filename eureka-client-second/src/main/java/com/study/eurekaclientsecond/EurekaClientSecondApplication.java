package com.study.eurekaclientsecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientSecondApplication.class, args);
    }
    // http://192.168.1.243:8082/hello

}
