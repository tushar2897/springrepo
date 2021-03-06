package com.zensar.spring.performers;

import com.zensar.spring.intruments.Instrument;

/*Author :Tushar Sadawarte
 * Creation Date:27-07-19 12:51PM IST
 * Modified Date:27-07-19 12:51PM IST
 * Version: 1.0
 * Copyright:Zensar Technologies. All right reserved.
 * Description:Instrumentalist information about his instrument of choice.
 * */
public class Instrumentalist implements Performer {
	private String song;
	private Instrument instrument;
	//for setter injection
	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
	}
	//for setter injection
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set");
	}
	//business logic of Instrumentalist
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing"+song);
		instrument.play();
	}

}
