package com.lichun.eurekaclient;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ClientApplication.class, args);
        new SpringApplicationBuilder(ClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}
