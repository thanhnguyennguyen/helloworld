package com.tutorialspoint.NotificationProvider;

public class NotificationProviderFactory {
	   public NotificationProvider getProvider(NotificationProviderType type){
		   NotificationProvider provider = null;
	      switch (type) {
	      case EMAIL:
	    	  provider = new EmailProvider();
	    	  break;
	      case SMS:
	    	  provider = new SmsProvider();
	    	  break;
	      case SLACK:
	    	  provider = new SlackProvider();
	    	  break;
	      case TELEGRAM:
	    	  provider = new TelegramProvider();
	    	  break;
	      }
		   return provider;
	   }
}