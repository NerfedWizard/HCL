package com.loel.com.loel.springFramework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource r=new ClassPathResource("spring.xml");
        BeanFactory b = new XmlBeanFactory(r);
        Product p1 = (Product)b.getBean("prd");
        p1.print();
    }
}
