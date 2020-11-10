package com.hzk.service.impl;

import com.hzk.service.IOrderService;
import com.hzk.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IOrderService orderService;

	public StudentServiceImpl(){
		System.out.println("student init");
	}

	@Override
	public void find() {
		System.out.println("student find");
	}
}
