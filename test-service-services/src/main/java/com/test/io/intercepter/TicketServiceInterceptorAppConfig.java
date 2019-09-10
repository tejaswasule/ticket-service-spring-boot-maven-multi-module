package com.test.io.intercepter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class TicketServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {
   @Autowired
   TicketServiceIntercepter ticketServiceIntercepter;

   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(ticketServiceIntercepter);
   }
}
