package com.tutorialspoint.IoC;

import com.tutorialspoint.IoC.NotificationProvider.*;

public class BankService {
	private Database database;
	private NotificationProvider notificationProvider;

	public BankService(Database database, NotificationProvider notificationProvider) {
		System.out.println("Inside BankService constructor.");
		this.database = database;
		this.notificationProvider = notificationProvider;
	}

	private void init() {
		System.out.println("Init BankService");
	}
	private void cleanup() {
		System.out.println("destroying BankService");
	}
	private void sendNotification() {
		this.notificationProvider.sendNotification();
	}

	private void saveData() {
		this.database.saveData();
	}
	public void updateData() {
		saveData();
		sendNotification();
	}
}