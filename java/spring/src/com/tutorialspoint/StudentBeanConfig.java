package com.tutorialspoint;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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

	@Pointcut("execution(* com.tutorialspoint.Student.set*(..))")
	private void setVal() {
	}

	@Pointcut("execution(* com.tutorialspoint.Student.get*(..))")
	private void getVal() {
	}

	@Before("setVal()")
	public void beforeSetVal() {
		System.out.println("Going to setup student profile.");
	}
	
	@Before("getVal()")
	public void beforeGetVal() {
		System.out.println("Going to get student profile.");
	}
	
	   /** 
     * This is the method which I would like to execute
     * when any method returns.
  */
  @AfterReturning(pointcut = "getVal()", returning = "retVal")
  public void afterReturningAdvice(Object retVal){
     System.out.println("Returning:" + retVal.toString() );
  }

  /**
     * This is the method which I would like to execute
     * if there is an exception raised by any method.
  */
  @AfterThrowing(pointcut = "getVal()", throwing = "ex")
  public void AfterThrowingAdvice(IllegalArgumentException ex){
     System.out.println("There has been an exception: " + ex.toString());   
  }
}