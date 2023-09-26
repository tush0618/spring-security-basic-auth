package com.tushar.springsecuritybasicauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringSecurityBasicAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicAuthApplication.class, args);
	}

}
