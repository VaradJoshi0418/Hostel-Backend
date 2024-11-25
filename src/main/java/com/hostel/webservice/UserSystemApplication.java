package com.hostel.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class UserSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserSystemApplication.class, args);
	}

}
