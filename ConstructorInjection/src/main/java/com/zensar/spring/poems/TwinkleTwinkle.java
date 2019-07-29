package com.zensar.spring.poems;
/*Author :Tushar Sadawarte
 * Creation Date:27-07-19 12:51PM IST
 * Modified Date:27-07-19 12:51PM IST
 * Version: 1.0
 * Copyright:Zensar Technologies. All right reserved.
 * Description:Poem above a little star
 * */
import com.zensar.spring.performers.Poem;

public class TwinkleTwinkle implements Poem {
	public final static String LINES [] = {
			"Twinkle Twinkle Little Star",
			"How I Wonder What You Are",
			"Up Above The World So High",
			"Like A Diamond In The Sky"
			};
	public void recite() {
		// TODO Auto-generated method stub
		for(String line:LINES){
			System.out.println(line);
		}
	}

}
