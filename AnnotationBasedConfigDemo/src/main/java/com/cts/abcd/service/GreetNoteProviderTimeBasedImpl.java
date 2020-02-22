package com.cts.abcd.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
@Component("g3")
public class GreetNoteProviderTimeBasedImpl implements GreetNoteProvider {

	public String getGreetNote() {
		// TODO Auto-generated method stub
		LocalDateTime today=LocalDateTime.now();
		int h=today.getHour();
		String g= "";
		if (h>=1 && h<12) {
			g="Good morning";
			
		}
		else if(h>=12 && h<16) {
			g="Good Afternoon";
		}
		else {
			g="Good Evening";
		}
		return g;
	}

}
