package com.tutorialspoint.CustomEvent;
import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
	}
	public String getEventName() {
		return "MyCustomEvent";
	}
}
