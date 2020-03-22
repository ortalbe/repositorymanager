package com.negev.seals.repositorymanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages={"com.negev.seals"})
@EnableSwagger2
public class RepositorymanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepositorymanagerApplication.class, args);
    }

}
