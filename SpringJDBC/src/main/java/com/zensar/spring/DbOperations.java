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
        Product p=new Product(2010,"CardReader","Lenovo",200.00f);
        ProductService service=ctx.getBean("productServiceImpl", ProductService.class);
        service.create(p);
    }
}
