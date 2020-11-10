package com.hzk.config;

import com.hzk.service.Y;
import com.hzk.service.impl.StudentServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition bd = (GenericBeanDefinition)beanFactory.getBeanDefinition("x");
		System.out.println(bd.getBeanClassName());
//		bd.setBeanClass(Y.class);
//		bd.setBeanClass(StudentServiceImpl.class);
	}
}
