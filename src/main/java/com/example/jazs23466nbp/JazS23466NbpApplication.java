package com.example.jazs23466nbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JazS23466NbpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JazS23466NbpApplication.class, args);
	}

}
