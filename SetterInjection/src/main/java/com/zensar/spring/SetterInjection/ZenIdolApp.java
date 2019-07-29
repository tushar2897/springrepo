package com.zensar.spring.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

/**
 * Hello world!
 *
 */
public class ZenIdolApp
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("performers.xml");
        Performer p=ctx.getBean("Tushar S",Performer.class);
        p.perform();
    }
}
