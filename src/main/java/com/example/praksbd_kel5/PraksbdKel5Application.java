package com.example.praksbd_kel5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
public class PraksbdKel5Application {

	public static void main(String[] args) {
		SpringApplication.run(PraksbdKel5Application.class, args);
	}

}
