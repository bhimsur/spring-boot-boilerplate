package io.bhimsur.springbootboilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class SpringBootBoilerplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBoilerplateApplication.class, args);
	}

}