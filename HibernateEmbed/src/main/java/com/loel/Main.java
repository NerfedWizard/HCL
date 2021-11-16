package com.loel;

import java.sql.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hibernate One-To-One example (Annotation)");

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		// tansient state --start
		EmployeeDetail employeeDetail = new EmployeeDetail("13th Street", "Pittsburgh", "PA", "U.S.");

		Employee employee = new Employee("Vivek", "Antony", new Date(10 - 10 - 10), "114-857-922");
		employee.setEmployeeDetail(employeeDetail);
		employeeDetail.setEmployee(employee);
		// HQL->Hibernate Query Language
		List<Employee> employees = session.createQuery("from employee").list();// HQL Hibernate Query Language
		for (Employee employee1 : employees) {
			System.out.println(employee1.getFirstname() + " , " + employee1.getLastname() + ", "
					+ employee1.getEmployeeDetail().getState() + employee1.getEmployeeDetail().getCity());
		}
		session.beginTransaction();
		System.out.println("b4 save");
		session.save(employee);
		System.out.println("after save");
		session.getTransaction().commit();

//      Address addr1=new Address();
//      addr1.setStreet("Interlaken dr");
//      addr1.setCity("Bethel Park");
//      addr1.setState("PA");
//      addr1.setZipcode("15102");
//      
//      Address addr2=new Address();
//      addr2.setStreet("HighField Ct");
//      addr2.setCity("Bridgeville");
//      addr2.setState("PA");
//      addr2.setZipcode("15058");
//      
//      UserDetails usr1=new UserDetails("Colin",addr1);
//      UserDetails usr2=new UserDetails("Bin",addr2);
//       
//     SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
//		Session s1=sf.openSession();
//		s1.beginTransaction();
//		s1.save(usr1);s1.save(usr2);
//      s1.getTransaction().commit();
//      s1.close();sf.close();
//      
	}

}
