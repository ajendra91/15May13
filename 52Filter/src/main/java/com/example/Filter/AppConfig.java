package com.example.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

 @Bean
 public FilterRegistrationBean < Demo > filterRegistrationBean() {
  FilterRegistrationBean < Demo > registrationBean = new FilterRegistrationBean<Demo>();
  Demo myFirstFilter = new Demo();

  registrationBean.setFilter(myFirstFilter);
  registrationBean.addUrlPatterns("/app/*");
  //registrationBean.setOrder(2); //set precedence
  return registrationBean;
 }
}