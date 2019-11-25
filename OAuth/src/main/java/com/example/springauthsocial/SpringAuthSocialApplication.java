package com.example.springauthsocial;

import com.example.springauthsocial.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SpringAuthSocialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthSocialApplication.class, args);
    }

}
