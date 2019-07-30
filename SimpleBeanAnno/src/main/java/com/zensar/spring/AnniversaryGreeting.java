package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
public class AnniversaryGreeting implements Greeting {

	public AnniversaryGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor Created");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Anniversary to you";
	}

}
