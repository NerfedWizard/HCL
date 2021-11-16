package com.loel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.getSessionFactoryBuilder().build();
		Session session = sf.openSession();
		Transaction t1 = session.beginTransaction();
		Employee e1 = new Employee(1003, "Mani", 12345);
		Employee e2 = new Employee(1004, "Erin", 12345);
		Employee e3 = new Employee(1005, "Luis", 12345);
//		session.save(e1);
//		session.save(e2);
//		session.save(e3);
//		t1.commit();
		System.out.println("Employee records inserted");
		System.out.println("________________________________");
		Employee er = session.load(Employee.class, new Integer(1003));// It will fetch the records from the memory
//		Employee er = session.get(Employee.class, new Integer(1000));// It will fetch the records from the
		// tables/database
		System.out.println(er.getEmpName());
		System.out.println(er.getEmpSal());
		System.out.println("________________________________");
		Session session2 = sf.openSession();
		Employee er2 = session.load(Employee.class, new Integer(1003));
		System.out.println(er2.getEmpName());
		System.out.println(er2.getEmpSal());
		System.out.println("________________________________");
//		sf.close();
//		session.close();

	}
}
