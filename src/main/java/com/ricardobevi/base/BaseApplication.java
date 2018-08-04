package com.ricardobevi.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BaseApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(BaseApplication.class, args);	}
}
