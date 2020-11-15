package com.hzk.listener;

import com.hzk.applicationevent.MyApplicationContextEvent;
import com.hzk.applicationevent.MyApplicationEvent;
import com.hzk.lifecycle.MySmartLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    @Autowired
    private MessageSource messageSource;
    @Autowired
    private MySmartLifecycle mySmartLifecycle;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ContextRefreshedEvent){
            // 国际化消息处理器
//            System.out.println("监听器：" + messageSource.getMessage("login.username",null,Locale.getDefault()));

            ApplicationContext applicationContext =  ((ContextRefreshedEvent) event).getApplicationContext();
			// 发布事件
			applicationContext.publishEvent(new MyApplicationEvent(applicationContext));
            // 发布自定义事件
			applicationContext.publishEvent(new MyApplicationEvent("自定义"));
			applicationContext.publishEvent(new MyApplicationContextEvent(applicationContext));
        }else if(event instanceof MyApplicationEvent){
			System.out.println("MyApplicationEvent，object=" + event.getSource());
		}else if(event instanceof MyApplicationContextEvent){
			System.out.println("MyApplicationContextEvent，object=" + event.getSource());
		}
    }
}
