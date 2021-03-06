package com.pluralsight.datarest.psguitar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class PsGuitarApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsGuitarApplication.class, args);
	}

}
