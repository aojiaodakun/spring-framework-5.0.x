package com.hzk.proxy;

public class CglibDemo {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		MyHandle myHandle = new MyHandle(userDao);
		UserDao proxy = (UserDao)myHandle.getProxy();
		proxy.query();
	}

}
