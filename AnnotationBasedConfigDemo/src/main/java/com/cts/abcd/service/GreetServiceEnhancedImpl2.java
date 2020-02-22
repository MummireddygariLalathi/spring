package com.cts.abcd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("g2")
public class GreetServiceEnhancedImpl2 implements GreetService{
	@Autowired
	@Qualifier("g4")
	private GreetNoteProvider gnp;
	
	public GreetServiceEnhancedImpl2() {
		super();
	}

	public GreetNoteProvider getGnp() {
		return gnp;
	}
	public void setGnp(GreetNoteProvider gnp) {
		this.gnp = gnp;
	}
	public GreetServiceEnhancedImpl2(GreetNoteProvider gnp) {
		super();
		this.gnp = gnp;
	}
	public String greet(String userName) {
		// TODO Auto-generated method stub
		return gnp.getGreetNote()+userName;
	}
	
	
	
}
