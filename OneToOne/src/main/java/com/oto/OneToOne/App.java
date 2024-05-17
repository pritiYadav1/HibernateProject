package com.oto.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=HibernateUtility.getSessionFactory();
        Session session=factory.openSession();
        
        Transaction transaction=session.beginTransaction();
        
        Adress address=new Adress("Shubhash Lane", "Mumbai", "Maharstra", "400067");
        
        Employee employee=new Employee("Neha", 123.78, address);
        
        
        session.save(employee);
        session.save(address);
        
        transaction.commit();
        
       System.out.println(employee);
       
       session.close();
    }
}
