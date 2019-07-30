package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("greetings.xml");
        //Greeting g=ctx.getBean("festivalGreeting",Greeting.class); //in case of component annotation, class names are taken as beanids with camel case
        
        Greeting g=ctx.getBean("diwali",Greeting.class);
        System.out.println(g.sayGreet());
    }
}
