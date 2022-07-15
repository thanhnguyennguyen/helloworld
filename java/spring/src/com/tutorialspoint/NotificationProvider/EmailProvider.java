package com.tutorialspoint.NotificationProvider;

public class EmailProvider implements NotificationProvider {
	@Override
	public void sendNotification() {
		System.out.println("sending notification via email.");
	}
}