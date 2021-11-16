package com.loel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
 

public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
    	Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory sf=md.getSessionFactoryBuilder().build();
    	Session session=sf.openSession();
    	Transaction t=session.beginTransaction();
    	 Employee e1=new Employee();    
         e1.setName("Saran");    
             
         PermanentEmployee e2=new PermanentEmployee();    
         e2.setName("Wonwin");    
         e2.setSalary(5000);    
         e2.setBonus(7);    
             
         ContractEmployee e3=new ContractEmployee();    
         e3.setName("Olex");    
         e3.setPay_per_hour(1000);    
         e3.setContract_duration("15 hours");
         
         
         session.persist(e1);    
         session.persist(e2);    
         session.persist(e3);    
         session.flush();
         t.commit();    
         session.close();    
    }
}
