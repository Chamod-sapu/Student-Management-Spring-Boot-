package com.studentmanager.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean //Configure the model mapper as a bean
	public ModelMapper modelMapper(){ // We use Model mapper to map the objects and entities. Actually get the data from request objects and put them in to entities.
		return new ModelMapper();
	}


}
