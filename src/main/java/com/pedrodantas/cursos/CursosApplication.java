package com.pedrodantas.cursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pedrodantas.cursos.service.DBService;

@SpringBootApplication
public class CursosApplication implements CommandLineRunner {

	@Autowired
	private DBService service;
	
	public static void main(String[] args) {
		SpringApplication.run(CursosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
     service.instantiateDataBase();
	}

}
