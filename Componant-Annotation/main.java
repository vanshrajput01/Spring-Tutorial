package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// in your main class Method have @SpringBootApplication so you can not add @component-scan(),@configuration,@EnableAutoConfiguration these Annotation..
public class Program01Application implements CommandLineRunner {
	@Autowired  // Automatically Inject dependency of Student class
	private Student student;

	public static void main(String[] args) {
		SpringApplication.run(Program01Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print(student.studName);
		System.out.println(student.studId);

	}

}
