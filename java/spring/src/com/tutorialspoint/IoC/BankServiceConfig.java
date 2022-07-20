package com.tutorialspoint.IoC;

import org.springframework.context.annotation.*;

import com.tutorialspoint.IoC.NotificationProvider.*;

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