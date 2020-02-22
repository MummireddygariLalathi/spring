package com.cts.service;

public class GreetServiceEnhancedImpl implements GreetService{
	private String greeting;
	public String greet(String userName){
		return userName;
	}
	

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		greeting = greeting;
	}


	public GreetServiceEnhancedImpl() {
		super();
	}


	public GreetServiceEnhancedImpl(String greeting) {
		super();
		this.greeting = greeting;
	}
	

}
