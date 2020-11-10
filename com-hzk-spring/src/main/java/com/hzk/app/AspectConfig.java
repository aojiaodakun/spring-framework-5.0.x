package com.hzk.app;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectConfig  {

//	 bean
	@Pointcut("within(com.hzk.service.X)")
	public void pointCut(){

	}

	@Before("pointCut()")
	public void before(){
		System.out.println("before...");
	}

	@After("pointCut()")
	public void after(){
		System.out.println("after...");
	}

//	// aop
//	@Pointcut("execution(* com.hzk.dao..*.*(..))")
//	public void pointCut(){
//
//	}





}
