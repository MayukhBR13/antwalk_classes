package com.map.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class MApMAnyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
        cfg.configure("com/hibernate/HibernateDemoProject/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();

//        Emp e1=new Emp();
//        Emp e2=new Emp();
//        
//        e1.setId(101);
//        e1.setName("MAyukh");
//        
//        e2.setId(102);
//        e2.setName("Arijit");
//        
//        Project p1=new Project();
//        Project p2=new Project();
//        
//        p1.setPid(501);
//        p1.setProjectName("HR Management System");
//        
//        p2.setPid(502);
//        p2.setProjectName("Automation Project");
//        
//        List<Emp> list1=new ArrayList<Emp>();
//        List<Project> list2=new ArrayList<Project>();
//        
//        list1.add(e1);
//        list1.add(e2);
//        
//        list2.add(p1);
//        list2.add(p2);
//        
//        e1.setProjects(list2);
//        p2.setEmployees(list1);
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
//        s.save(e1);
//        s.save(e2);
//        s.save(p1);
//        s.save(p2);
        
        //query1 -> empid->list of projects
    	//query2 -> projectid->emps
        int empid=101;
        Emp em=(Emp)s.get(Emp.class, empid );
        if(em!=null) {
        	for(Project p:em.getProjects())
        		System.out.println(p);
        }
        
        int projid=502;
        Project proj=(Project)s.get(Project.class, projid );
        if(proj!=null) {
        	for(Emp e:proj.getEmployees())
        		System.out.println(e);
        }
        
       // tx.commit();
        s.close();
	}

}
