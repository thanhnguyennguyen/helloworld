package com.tutorialspoint.NotificationProvider;

public class SlackProvider implements NotificationProvider {
	@Override
	public void sendNotification() {
		System.out.println("sending notification via Slack.");
	}
}