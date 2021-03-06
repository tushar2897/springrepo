package com.zensar.spring.performers;
/*Author :Tushar Sadawarte
 * Creation Date:27-07-19 12:51PM IST
 * Modified Date:27-07-19 12:51PM IST
 * Version: 1.0
 * Copyright:Zensar Technologies. All right reserved.
 * Description:Poetic Juggler juggles while reciting poems.
 * */
public class PoeticJuggler extends Juggler {
	private Poem poem;

	public PoeticJuggler() {
		super();
		System.out.println("No-arg Constructor of PoeticJuggler");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("param contructor of PoeticJuggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While reciting a poem................");
		poem.recite();
	}

	
	
}
