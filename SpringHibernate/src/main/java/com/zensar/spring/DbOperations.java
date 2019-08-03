package com.zensar.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

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
        ProductService service=ctx.getBean("productServiceImpl", ProductService.class);
     
       /* Product p=new Product(1080,"MicroSD","Sandisk",759.00f);
        service.create(p);
*/        
      /* Product p1=new Product(2010);
        ProductService service1=ctx.getBean("productServiceImpl", ProductService.class);
        service1.remove(p1);*/
       
       Product p2=new Product(1005,"CardReader","Strontium",700.00f);
        ProductService service2=ctx.getBean("productServiceImpl", ProductService.class);
        service2.edit(p2);
        
        /*List<Product> list=service.findAllProducts();
        for(Product l:list){
        	System.out.println(l);
        }*/

        
        
  }
}
