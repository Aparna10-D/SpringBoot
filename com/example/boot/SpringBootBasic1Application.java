package com.example.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.assignment.autowiring.CarFactory;

@SpringBootApplication
@ComponentScan({"com.example.boot","com.assignment.autowiring"})
public class SpringBootBasic1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasic1Application.class, args);
		
	}
	@Autowired
	private CarFactory carFactory;
	
	public void run(String... args) throws Exception {
		carFactory.checkBrands().forEach(System.out::println);;
		
	}

}
