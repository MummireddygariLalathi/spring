package com.cts.ui;

import com.cts.service.Greet;
import com.cts.service.GreetNoteProvider;
import com.cts.service.GreetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DidApp01 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansOne.xml");
		GreetService gs=(GreetService)context.getBean("g1");
		System.out.println(gs.greet("lal"));
		GreetService gs2=(GreetService)context.getBean("g2");
		System.out.println(gs2.greet("lalu"));
		GreetService gs3=(GreetService)context.getBean("g3");
		System.out.println(gs3.greet("Hello"));
		GreetService gs4=(GreetService)context.getBean("g4");
		System.out.println(gs4.greet("Hai"));
				

	}

}
