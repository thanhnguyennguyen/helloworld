package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
	   
//	      ApplicationContext ctx = 
//	    	         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//	    	   
//	    	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
//	    	      helloWorld.setMessage("Hello World!");
//	    	      helloWorld.getMessage();
		ApplicationContext bankCtx = new AnnotationConfigApplicationContext(BankServiceConfig.class);

		BankService bank = bankCtx.getBean(BankService.class);
		bank.updateData();   
	    	      
   }
}