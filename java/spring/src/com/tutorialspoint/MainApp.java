package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		System.out.println("\n\nTest Bank Service");
		AbstractApplicationContext bankCtx = new AnnotationConfigApplicationContext(BankServiceConfig.class);

		BankService bank = bankCtx.getBean(BankService.class);
		bank.updateData();
		bankCtx.registerShutdownHook();
		((AbstractApplicationContext) bankCtx).close();

		
//		ApplicationContext studentCtx = new ClassPathXmlApplicationContext("BeanStudent.xml");
//
//		Student student = (Student) studentCtx.getBean("student");
//		student.getName();
//		student.getAge();
//		((AbstractApplicationContext) studentCtx).close();

		System.out.println("\n\nTest Student profile");
		AbstractApplicationContext studentCtx = new AnnotationConfigApplicationContext(StudentBeanConfig.class);

		Student student = studentCtx.getBean(Student.class);
		student.setName("Zara");
		student.getName();
		student.setAge(11);
		student.getAge();
		studentCtx.registerShutdownHook();
		((AbstractApplicationContext) studentCtx).close();
	}
}