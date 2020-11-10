package com.hzk.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyHandle implements MethodInterceptor {

	private Object target;

	public MyHandle(Object target){
		this.target = target;
	}

	public Object getProxy(){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}


	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("before...");
		method.invoke(target,objects);
		System.out.println("after...");
		return null;
	}

}
