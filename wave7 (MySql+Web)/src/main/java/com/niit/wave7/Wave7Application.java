package com.niit.wave7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication //(exclude = DataSourceAutoConfiguration.class)
@ComponentScan("com.niit.controller")
@ComponentScan("com.niit.service")
@ComponentScan("com.niit.dao")
@EnableJpaRepositories("com.niit.dao")
@EntityScan("com.niit.model")
// @Configuration -> spring-servlet.xml, web.xml
// @Configuration -> define all the beans
// @ComponentScan -> scan all the packages
public class Wave7Application {

    public static void main(String[] args) {
        SpringApplication.run(Wave7Application.class, args);
    }

}
