package com.hzk.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyJDKInvocationHandle implements InvocationHandler {

	private Object target;


	public MyJDKInvocationHandle(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("jdk before...");
		method.invoke(target,args);
		System.out.println("jdk after...");
		return null;
	}
}
