package com.example.jazs23466nbp;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JazS23466NbpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JazS23466NbpApplication.class, args);


	}

	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI()
				.info(new Info()
						.title("JAZ kolos")
						.version("1.0")
						.description("Kacper Sewruk s23466")
						.license(new License().name("PJATK").url("https://pja.edu.pl/")));
	}

}
