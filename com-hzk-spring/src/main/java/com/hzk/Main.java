package com.hzk;

import com.Test;
import com.hzk.app.AppConfig;
import com.hzk.dao.UserDao;
import com.hzk.service.IOrderService;
import com.hzk.service.X;
import com.hzk.service.Y;
import com.hzk.service.impl.OrderServiceImpl;
import com.hzk.service.impl.StudentServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// bean
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);


//		applicationContext.registerBean("test11111", Test.class);
//		System.out.println(applicationContext.getBean("test11111"));
//		X object = applicationContext.getBean(X.class);
//		object.aop();


		// aop
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserDao bean = ac.getBean(UserDao.class);
//		bean.query();

	}

}
