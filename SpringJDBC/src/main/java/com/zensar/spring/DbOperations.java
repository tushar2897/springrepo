package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig.xml");
       /* Product p=new Product(2010,"CardReader","Lenovo",200.00f);
        ProductService service=ctx.getBean("productServiceImpl", ProductService.class);
        service.create(p);*/
        
       /* Product p1=new Product(2010);
        ProductService service1=ctx.getBean("productServiceImpl", ProductService.class);
        service1.remove(p1);*/
       /*
        Product p2=new Product(1005,"CardReader","Lenovo",200.00f);
        ProductService service2=ctx.getBean("productServiceImpl", ProductService.class);
        service2.edit(p2);*/
 
        
        
  }
}
