package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("diwali")
public class FestivalGreeting implements Greeting {

	public FestivalGreeting() {
		
		// TODO Auto-generated constructor stub
		System.out.println("Festival Greeting Created");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Diwali to everyone";
	}

}
