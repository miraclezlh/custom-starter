package com.zlh.boot.custom_starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class CustomStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomStarterApplication.class, args);
	}

}
