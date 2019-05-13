package com.example.Interlization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class AppController {

    @Autowired
    private MessageSource messageSource;

	@GetMapping("/")
	public String kk(Locale locale) {
		return messageSource.getMessage("hello.world", null, locale);
	}

	@GetMapping("/hello-inter")
	public String helloWorldToAll(@RequestHeader(name="Accept-Language") Locale locale) {
		return messageSource.getMessage("hello.world", null, locale);
	}

    @GetMapping("/hello")
    public ResponseEntity<Object> displayHello(Locale locale) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept-Language","hindi");
		String s=messageSource.getMessage("hello.world", null, locale);
        return new ResponseEntity<Object>(s,headers, HttpStatus.OK);
    }


}
