package com.zensar.spring.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
        System.out.println();
        Performer p1=ctx.getBean("Growly",Performer.class);
        p1.perform();
        System.out.println();
        Performer p2=ctx.getBean("Dean",Performer.class);
        p2.perform();
        System.out.println();
        Performer p3=ctx.getBean("Sam",Performer.class);
        p3.perform();
        
        
        ConfigurableApplicationContext cfgCtx=(ConfigurableApplicationContext) ctx;
        //Shutting down Spring IoC Container
        cfgCtx.close();
    }
}
