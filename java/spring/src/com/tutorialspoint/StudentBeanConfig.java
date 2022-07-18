package com.tutorialspoint;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Aspect
@Configuration
public class StudentBeanConfig {
	@Bean
	public Student student() {
		return new Student();
	}

	@Before("execution(* com.tutorialspoint.Student.setName(..))")
	public void logBeforeSettingName() throws Throwable {
		System.out.println("Before setting name");
	}
	@Before("execution(* com.tutorialspoint.Student.setAge(..))")
	public void logBeforeSettingAge() throws Throwable {
		System.out.println("Before setting age");
	}
	
	@Before("execution(* com.tutorialspoint.Student.getName(..))")
	public void logBeforeGettingName() throws Throwable {
		System.out.println("Before getting name");
	}
	@Before("execution(* com.tutorialspoint.Student.getAge(..))")
	public void logBeforeGettingAge() throws Throwable {
		System.out.println("Before getting age");
	}
	
	@AfterReturning("execution(* com.tutorialspoint.Student.getName(..))")
	public void logAfterGettingName() throws Throwable {
		System.out.println("After returning name");
	}
	@AfterReturning("execution(* com.tutorialspoint.Student.getAge(..))")
	public void logAfterGettingAge() throws Throwable {
		System.out.println("After returning age");
	}
}