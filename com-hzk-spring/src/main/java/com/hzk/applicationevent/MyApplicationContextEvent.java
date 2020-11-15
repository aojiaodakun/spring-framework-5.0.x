package com.hzk.applicationevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class MyApplicationContextEvent extends ApplicationContextEvent {
	private static final long serialVersionUID = 7099057708183571937L;
	public MyApplicationContextEvent(ApplicationContext source) {
		super(source);
	}
}
