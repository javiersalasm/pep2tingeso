package com.tingeso.ms1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ms1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms1Application.class, args);
	}

}
