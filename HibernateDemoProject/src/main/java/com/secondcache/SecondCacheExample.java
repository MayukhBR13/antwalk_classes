package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.HibernateDemoProject.Student;

public class SecondCacheExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
        cfg.configure("com/hibernate/HibernateDemoProject/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session1=factory.openSession();
        Student student=session1.get(Student.class,101);
        System.out.println(student);
        session1.close();
        
        Session session2=factory.openSession();
        Student student2=session1.get(Student.class,101);
        System.out.println(student2);
        session2.close();
        
	}

}
