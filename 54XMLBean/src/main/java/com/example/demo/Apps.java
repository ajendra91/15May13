package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource("bean.xml")
public class Apps {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(Apps.class, args);
		
		
		ConfigurableApplicationContext cac = SpringApplication.run(Apps.class, args);
		Ajay ajay =cac.getBean(Ajay.class);
		System.out.println(ajay.name);

		System.out.println("Hit Enter to terminate");
		System.in.read();
		cac.close();
	}

}
