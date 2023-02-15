package com.HQLDemo;

import java.util.Arrays;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.HibernateDemoProject.Student;

public class HQLExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
        cfg.configure("com/hibernate/HibernateDemoProject/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
		String query = "FROM Student";
//		String query = "FROM Student where city='Gotham'";
		
//		String query = "FROM Student where city=:x";
		
		Query<Student> q = s.createQuery(query);
//		q.setParameter("x", "Gotham");
		
		List<Student> l = q.list();
		
		for(Student student : l) {
			System.out.println(student);
		}
		
//		delete query
		Transaction tx = s.beginTransaction();
		String query2 = "DELETE FROM Student where id=:x";
		Query<Student> q2 = s.createQuery(query2);
		q2.setParameter("x", 105);
		int count = q2.executeUpdate();
		System.out.println(count + " objects deleted");
		
//		update query
		String query3 = "UPDATE Student set city=:x where id=:y";
		Query<Student> q3 = s.createQuery(query3);
		q3.setParameter("x", "New York");
		q3.setParameter("y", 101);
		count = q3.executeUpdate();
		System.out.println(count + " objects updated");
		
		l = q.list();
		
		for(Student student : l) {
			System.out.println(student);
		}
		
//		join
		Query q4 = s.createQuery("select q.question, q.questionid, a.answer from Question as q inner join q.answers as a");
		List<Object[]> list4 = q4.getResultList();
		
		for(Object[] arr : list4) {
			System.out.println(Arrays.toString(arr));
		}
		
		tx.commit();
		s.close();
	}

}
