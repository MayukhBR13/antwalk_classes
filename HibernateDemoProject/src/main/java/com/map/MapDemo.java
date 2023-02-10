package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Configuration cfg=new Configuration();
        cfg.configure("com/hibernate/HibernateDemoProject/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();

        /*Question q1=new Question();
        q1.setQuestionId(101);
        q1.setQuestion("What is JSP?");
        
        Answer ans1=new Answer();
        ans1.setAnswerId(501);
        ans1.setAnswer("Java server Pages");
//        q1.setAnswer(ans1);
        
        Question q2=new Question();
        q2.setQuestionId(102);
        q2.setQuestion("What is Hibernet?");

        Answer ans2=new Answer();
        ans2.setAnswerId(502);
        ans2.setAnswer("ORM Tool");
//        q2.setAnswer(ans2);
        
        Answer ans3=new Answer();
        ans3.setAnswerId(5012);
        ans3.setAnswer("jstl");
//        q2.setAnswer(ans2);
        List<Answer> ansl1=new ArrayList<Answer>();
        ansl1.add(ans1);
        ansl1.add(ans3);
        q1.setAnswer(ansl1);
        
        List<Answer> ansl2=new ArrayList<Answer>();
        ansl2.add(ans2);
        q2.setAnswer(ansl2);*/
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
        /*s.save(q1);
        s.save(q2);
        s.save(ans3);
        s.save(ans1);
        s.save(ans2);*/
        
        Question q=(Question) s.get(Question.class, 101);
        
        System.out.println(q.getQuestion());
        for(Answer a:q.getAnswer())
        	System.out.println(a.getAnswer());
        
        tx.commit();
        s.close();
	}

}
