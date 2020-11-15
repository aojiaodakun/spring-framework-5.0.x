package com.hzk.lifecycle;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

// 生命周期
@Component
public class MySmartLifecycle implements SmartLifecycle {
	@Override
	public void start() {
		System.out.println("MyLifecycle start...");
	}

	@Override
	public void stop() {
		System.out.println("MyLifecycle stop...");
	}

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void stop(Runnable callback) {

	}

	@Override
	public int getPhase() {
		return 0;
	}
}
