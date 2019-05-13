package com.example.Interlization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	/*@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver alr=new AcceptHeaderLocaleResolver();
		//SessionLocaleResolver slr = new SessionLocaleResolver();
		alr.setDefaultLocale(Locale.US);
		return alr;

	}


	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}*/


}
