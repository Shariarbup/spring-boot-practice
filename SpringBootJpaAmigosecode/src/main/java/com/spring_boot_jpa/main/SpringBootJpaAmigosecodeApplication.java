package com.spring_boot_jpa.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaAmigosecodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaAmigosecodeApplication.class, args);
	}
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return (args)->{
			Student shariar = new Student("Al", "Shariar","al.shariar@bjitgroup.com", 21);
			studentRepository.save(shariar);
		};
	}

}
