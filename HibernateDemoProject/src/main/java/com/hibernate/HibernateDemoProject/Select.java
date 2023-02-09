package com.hibernate.HibernateDemoProject;

import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("com/hibernate/HibernateDemoProject/hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        try {
        Student student=(Student)session.load(Student.class, sc.nextInt());
        System.out.println("Student NAme: "+student.getName());
        System.out.println("Student City: "+student.getCity());
        System.out.println(student);
        }catch(Exception e) {
         	e.printStackTrace();
        }
        session.close();
	}

}
