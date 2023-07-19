package com.moinak.ecomdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EcomDemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(EcomDemoApplication.class, args);

	}

}
