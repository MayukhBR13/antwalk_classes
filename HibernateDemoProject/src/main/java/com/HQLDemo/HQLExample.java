package com.HQLDemo;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.HibernateDemoProject.Student;

public class HQLExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
        cfg.configure("com/hibernate/HibernateDemoProject/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        
        String query="from com.hibernate.HibernateDemoProject.Student";
        Query<Student> q=s.createQuery(query);
//        q.setParameter("x", "mumbai");
        
        List<Student> list=q.list();
        
        for(Student st:list) {
        	System.out.println(st.toString());
        }
        s.close();
	}

}
