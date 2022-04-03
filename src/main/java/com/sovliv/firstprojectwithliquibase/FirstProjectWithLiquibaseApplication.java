package com.sovliv.firstprojectwithliquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectWithLiquibaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectWithLiquibaseApplication.class, args);
    }


    /**
     * spring:
     *   liquibase:
     *     enabled: false
     *
     *   datasource:
     *     url: jdbc:h2:mem:testdb
     *     username: u
     *     password: 1
     *
     *   jpa:
     *     spring.jpa.database-platform: org.hibernate.dialect.H2Dialect
     *     hibernate:
     *       ddl-auto: none
     *
     *   h2:
     *     console:
     *       enabled: true
     */
}
