package com.tutorialspoint.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.aop.Student;
import com.tutorialspoint.aop.StudentBeanConfig;
import com.tutorialspoint.helloworld.HelloWorld;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		((AbstractApplicationContext) context).close();

//	      ApplicationContext ctx = 
//	    	         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//	    	   
//	    	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
//	    	      helloWorld.setMessage("Hello World!");
//	    	      helloWorld.getMessage();


		
	}
}