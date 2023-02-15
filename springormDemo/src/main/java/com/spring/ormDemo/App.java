package com.spring.ormDemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ormDemo/config.xml");
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	
    	Scanner sc=new Scanner("System.in");
    	int c;
    	while((c=sc.nextInt())==6) {
    		System.out.println("Student\n1. Add\n2. display student detail\n3. all student details\n4. delete"
    				+ "\n5. update\n6. exit\nEnter:  ");
    		try {
    			switch(c) {
    			case 1:
    				Student s1=new Student();
    				System.out.println("enter student id: ");
    				s1.setId(sc.nextInt());
    				System.out.println("enter student name: ");
    				s1.setName(sc.next());
    				System.out.println("enter student city: ");
    				s1.setCity(sc.next());
    				
    				int r=studentDao.insert(s1);
    				System.out.println(r+ " student added");
    			break;
    			case 2:

    				System.out.println("enter student id: ");
    				int sid2=sc.nextInt();
    				
    				System.out.println(studentDao.getStudent(sid2));    				
    			break;
    			case 3:
    				System.out.println(studentDao.getAllStudent());    				
    			break;
    			case 4:
    				System.out.println("enter student id: ");
    				int sid4=sc.nextInt();
    				studentDao.deleteStudent(sid4);
    				System.out.println(" Deleted");    				
    			break;
    			case 5:
    				Student s5=new Student();
    				System.out.println("enter student id: ");
    				s5.setId(sc.nextInt());
    				System.out.println("enter student name: ");
    				s5.setName(sc.next());
    				System.out.println("enter student city: ");
    				s5.setCity(sc.next());
    				
    				studentDao.updateStudent(s5);
    				System.out.println(" student Updated");		
    			break;
    			}
    		}catch(Exception e) {
    			System.out.println("Error: "+e);
    		}
    	}
    }
}
