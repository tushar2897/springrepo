package com.zensar.spring;

/*Author :Tushar Sadawarte
 * Creation Date:27-07-19 12:45PM IST
 * Modified Date:27-07-19 12:45PM IST
 * Version: 1.0
 * Copyright:Zensar Technologies. All right reserved.
 * Description:It is used to greet someone on the festival of Holi. 
 * */
public class HoliGreeting implements Greeting {
	
	public HoliGreeting() {
		System.out.println("HoliGreeting Created");
		// TODO Auto-generated constructor stub
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi! May your life full of colors!";
	}

}
