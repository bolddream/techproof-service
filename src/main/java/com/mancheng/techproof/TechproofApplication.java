package com.mancheng.techproof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.,abc.")
public class TechproofApplication {



	public static void main(String[] args) {
		SpringApplication.run(TechproofApplication.class, args);

	}


}
