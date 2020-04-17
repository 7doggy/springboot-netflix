package com.lichun.eurekaclient;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ClientApplication.class, args);
        new SpringApplicationBuilder(ClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}
