package com.tutorialspoint.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		System.out.println("\n\nTest Student profile");	
//		ApplicationContext studentCtx = new ClassPathXmlApplicationContext("BeanStudent.xml");
//
//		Student student = (Student) studentCtx.getBean("student");
//		student.getName();
//		student.getAge();
//		((AbstractApplicationContext) studentCtx).close();


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