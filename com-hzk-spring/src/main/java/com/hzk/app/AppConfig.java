package com.hzk.app;

import com.hzk.config.MyBeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.hzk.bean")
//@EnableAspectJAutoProxy
@Import(MyBeanDefinitionRegistryPostProcessor.class)
public class AppConfig {


}
