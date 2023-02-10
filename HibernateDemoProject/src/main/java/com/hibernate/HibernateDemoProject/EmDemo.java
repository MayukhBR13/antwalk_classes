package com.hibernate.HibernateDemoProject;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Configuration cfg=new Configuration();
        cfg.configure("com/hibernate/HibernateDemoProject/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Student std1=new Student();
        std1.setId(1);
        std1.setName("aniket");
        std1.setCity("kolkata");
        
        Certificate cert=new Certificate();
        cert.setCourse("Hibernate");
        cert.setDuration("10d");
        std1.setCert(cert);
        
        Student std2=new Student();
        std2.setId(2);
        std2.setName("anirban");
        std2.setCity("mumbai");
        
        Certificate cert2=new Certificate();
        cert2.setCourse("Hibernate JSP");
        cert2.setDuration("15d");
        std2.setCert(cert2);
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
        
        

        s.save(std1);
        s.save(std2);
        s.close();
	}

}
