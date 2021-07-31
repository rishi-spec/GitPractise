package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitPractiseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(GitPractiseApplication.class, args);
		
		
		String name =  "This is from develop branch";
		System.out.println(name);
		
		String msg = "This is from feature-101";
		System.out.println(msg);
		
		String feature102="This is Feature 102";
		System.out.println(feature102);
		 
	}

}
