package com.cts.ui;

import com.cts.service.Greet;
import com.cts.service.GreetNoteProvider;
import com.cts.service.GreetService;
import com.cts.service.GreetServiceEnhancedImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DidApp2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansTwo.xml");
		
//		GreetServiceEnhancedImpl gs2=(GreetServiceEnhancedImpl)context.getBean("g2");
//    	System.out.println(gs2.greet("lalu"));
//		System.out.println(gs2.greet("vanakam"));
//		GreetServiceEnhancedImpl gs3=(GreetServiceEnhancedImpl)context.getBean("g2");
//		System.out.println(gs3.greet("lalu"));
		GreetService gs4=(GreetService)context.getBean("g3");
		System.out.println(gs4.greet("hai"));
		

	}

}
