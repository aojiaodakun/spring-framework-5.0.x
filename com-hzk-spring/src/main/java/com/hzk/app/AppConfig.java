package com.hzk.app;

import com.hzk.config.MyBeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.hzk")
//@EnableAspectJAutoProxy
@Import(MyBeanDefinitionRegistryPostProcessor.class)
public class AppConfig {


}
