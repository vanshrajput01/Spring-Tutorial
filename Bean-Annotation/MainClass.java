package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Program01Application implements CommandLineRunner {
	@Autowired
	private Student student;

	public static void main(String[] args) {
		SpringApplication.run(Program01Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print(student.studName);
		System.out.println(student.studId);

	}

              // OR if you can not use @Autowired Annotation to inject depandency of Student clas
@SpringBootApplication
public class Program01Application implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Program01Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		// here you write pass Method(in Java Config class file) name in getBeanMathod
		// to get Bean.
		// if you can not pass name of method name so that you have to add bean name in
		// javaconfig class.
		Student st = context.getBean("getStudent", Student.class);
		System.out.println(st.studName);
		System.out.println(st.studId);

	}




}
