package com.hzk.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Y implements BeanNameAware, ApplicationContextAware, InitializingBean {

	@Autowired
	X x;

	public Y(){
		System.out.println("create Y");
	}


	@PostConstruct
	public void init(){
		System.out.println("YYY invoke init life call...");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("YYY setBeanName...");
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("YYY setApplicationContext...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("YYY afterPropertiesSet...");
	}
}
