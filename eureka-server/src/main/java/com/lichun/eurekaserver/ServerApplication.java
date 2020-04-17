package com.lichun.eurekaserver;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {
    public static void main(String[] args) {
        //SpringApplication.run(ServerApplication.class, args);
        new SpringApplicationBuilder(ServerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
