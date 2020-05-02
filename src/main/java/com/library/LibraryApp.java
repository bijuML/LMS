package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.library", "com.library.repository" })
@EnableJpaRepositories(basePackages = "com.library.repository")
@SpringBootApplication
public class LibraryApp {
	public static void main(String[] args) {
		SpringApplication.run(LibraryApp.class, args);
	}
}