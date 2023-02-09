package com.hibernate.HibernateDemoProject;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
        cfg.configure("com/hibernate/HibernateDemoProject/hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction tx= session.beginTransaction();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        Student student=(Student)session.get(Student.class, sc.nextInt());
       
        if(student!=null) {
        	System.out.println("Enter new city");
        	student.setCity(sc.next());
	        session.update(student);
	        session.flush();
	        tx.commit();
	        System.out.println("Record updated successfully");
        }else {
         	System.out.println("No such recort found");
        }
        session.close();
	}

}
