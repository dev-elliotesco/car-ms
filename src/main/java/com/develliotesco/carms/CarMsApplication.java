package com.develliotesco.carms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarMsApplication {

	public static void main(String[] args) {

		SpringApplication.run(CarMsApplication.class, args);
		final Logger log = LoggerFactory.getLogger(CarMsApplication.class);
		log.info("Bienvenido a demo de microservicios - car ms");
	}

}
