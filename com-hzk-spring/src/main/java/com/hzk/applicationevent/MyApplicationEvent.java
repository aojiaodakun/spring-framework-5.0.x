package com.hzk.applicationevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * 自定义事件
 */
public class MyApplicationEvent extends ApplicationEvent {
	private static final long serialVersionUID = 7099057708183571937L;
	public MyApplicationEvent(ApplicationContext source) {
		super(source);
	}
	public MyApplicationEvent(Object source) {
		super(source);
	}

	private String name = "二狗子";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyCustomEvent{" +
				"name='" + name + '\'' +
				'}';
	}
}
