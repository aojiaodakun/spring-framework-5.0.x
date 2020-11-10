package com.hzk.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class X implements BeanNameAware, ApplicationContextAware, InitializingBean {

	@Autowired
	Y y;


	public X(){
		System.out.println("create X");
	}

	@PostConstruct
	public void init(){
		System.out.println("XXX invoke init life call...");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("XXX setBeanName...");
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("XXX setApplicationContext...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("XXX afterPropertiesSet...");
	}

	public void aop(){
		System.out.println("x aop...");
	}

}
