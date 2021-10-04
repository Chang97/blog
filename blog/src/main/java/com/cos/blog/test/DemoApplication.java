package com.cos.blog.test;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println( System.getProperty("user.dir") );
		// D:\workspace\demo
	}
}