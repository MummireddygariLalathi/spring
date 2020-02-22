package com.cts.service;

public class GreetServiceEnhancedImpl2 implements GreetService{
	private GreetNoteProvider gnp;
	
	public GreetServiceEnhancedImpl2() {
		super();
	}
//	public String greet(String userName){
//		return gnp.getGreetNote()+userName;
//	}
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
