package com.tutorialspoint.NotificationProvider;

public class TelegramProvider implements NotificationProvider {
	@Override
	public void sendNotification() {
		System.out.println("sending notification via Telegram.");
	}
}