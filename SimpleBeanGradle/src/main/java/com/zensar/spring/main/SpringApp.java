package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.simple.Greeting;

public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext ctx=new ClassPathXmlApplicationContext("greetings.xml");
	Greeting g=ctx.getBean("diwaligreeting",Greeting.class);
	System.out.println(g.sayGreet());
	}

}
