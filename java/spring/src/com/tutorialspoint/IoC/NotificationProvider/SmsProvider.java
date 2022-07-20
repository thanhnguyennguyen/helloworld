package com.tutorialspoint.IoC.NotificationProvider;

public class SmsProvider implements NotificationProvider {
	@Override
	public void sendNotification() {
		System.out.println("sending notification via SMS.");
	}
}