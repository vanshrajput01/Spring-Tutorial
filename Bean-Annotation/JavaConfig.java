package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean // this Annotation help to manager of this class object life cycle by IoC constainter 
	Student getStudent() {
		return new Student();
	}

}
