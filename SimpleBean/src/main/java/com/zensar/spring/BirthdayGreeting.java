package com.zensar.spring;

/*Author :Tushar Sadawarte
 * Creation Date:27-07-19 12:51PM IST
 * Modified Date:27-07-19 12:51PM IST
 * Version: 1.0
 * Copyright:Zensar Technologies. All right reserved.
 * Description:It is a specialised greeting used to greet anyone on his/her birthday.
 * */

public class BirthdayGreeting implements Greeting {

	public BirthdayGreeting(){
		System.out.println("Birthday Greeting created");
	}
	
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Birthday";
	}

}
