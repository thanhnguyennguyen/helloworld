package com.tutorialspoint.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.aop.Student;
import com.tutorialspoint.aop.StudentBeanConfig;
import com.tutorialspoint.helloworld.HelloWorld;

public class MainApp {
	public static void main(String[] args) {

		System.out.println("\n\nTest Bank Service");
		AbstractApplicationContext bankCtx = new AnnotationConfigApplicationContext(BankServiceConfig.class);

		BankService bank = bankCtx.getBean(BankService.class);
		bank.updateData();
		bankCtx.registerShutdownHook();
		((AbstractApplicationContext) bankCtx).close();	
	}
}