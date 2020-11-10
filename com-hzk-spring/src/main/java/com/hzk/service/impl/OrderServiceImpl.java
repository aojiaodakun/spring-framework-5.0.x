package com.hzk.service.impl;

import com.hzk.service.IOrderService;
import com.hzk.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

//@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	IStudentService studentService;


	public OrderServiceImpl(){
		System.out.println("order init");
	}

	@Override
	public void query() {
		System.out.println("查询订单");
	}
}
