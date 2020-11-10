package com.hzk.proxy.jdk;

import java.lang.reflect.Proxy;
import java.util.ArrayList;

public class ProxyDemo {

	public static void main(String[] args) {
		IStudentService studentService = new StudentServiceImpl();
		MyJDKInvocationHandle handle = new MyJDKInvocationHandle(studentService);


		IStudentService proxy1 = (IStudentService)Proxy.newProxyInstance(studentService.getClass().getClassLoader(),
				studentService.getClass().getInterfaces(),
				handle);
		System.out.println(proxy1);
		proxy1.query();


	}

}
