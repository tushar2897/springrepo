package com.zensar.spring.intruments;
/*Author :Tushar Sadawarte
 *Creation Date:27-07-19 12:51PM IST
 * Modified Date:29-07-19 03:23PM IST
 * Version: 3.0
 * Copyright:Zensar Technologies. All right reserved.
 * Description:Play the guitar chords.
 * */
public class Guitar implements Instrument {

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("D#7,G-Major,A-Minor,E-Minor");
	}
	public void tune(){
		System.out.println("Guitar is Tuned");
		
	}
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is packed");
	}
}
