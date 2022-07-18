package com.tutorialspoint;

import com.tutorialspoint.NotificationProvider.*;

import org.springframework.context.annotation.*;

@Configuration
public class BankServiceConfig {
	@Bean(initMethod = "init", destroyMethod = "cleanup")
	public BankService bankService() {
		return new BankService(database(), notificationProvider(NotificationProviderType.TELEGRAM));
	}

	@Bean
	public NotificationProvider notificationProvider(NotificationProviderType providerType) {
		return NotificationProviderFactory.getProvider(providerType);
	}

	@Bean
	public Database database() {
		return new Database();
	}
}