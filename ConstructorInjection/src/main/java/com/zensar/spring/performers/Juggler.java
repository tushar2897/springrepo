package com.zensar.spring.performers;
/*Author :Tushar Sadawarte
 * Creation Date:27-07-19 12:51PM IST
 * Modified Date:27-07-19 12:51PM IST
 * Version: 1.0
 * Copyright:Zensar Technologies. All right reserved.
 * Description:Jugglers juggles the juggly juggly jiggles.
 * */
public class Juggler implements Performer {
	
		private int beanBags;
		
	

	public Juggler() {
		super();
		System.out.println("No-arg constructor");
	}

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("param constructor of Juggler");
	}
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Juggler juggling "+beanBags);
	}
}
