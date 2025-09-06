package com.tariq.ApiGatewayBlogBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.tariq")
public class ApiGatewayBlogBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayBlogBeApplication.class, args);
	}

}
