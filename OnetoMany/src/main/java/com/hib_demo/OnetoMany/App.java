package com.hib_demo.OnetoMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Transaction transcation=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transcation=session.beginTransaction();
			 Answer ans1=new Answer();    
		        ans1.setAnswername("Java is a programming language");    
		        ans1.setPostedBy("Ravi Malik");    
		            
		        Answer ans2=new Answer();    
		        ans2.setAnswername("Java is a platform");    
		        ans2.setPostedBy("Sudhir Kumar");    
		            
		        Answer ans3=new Answer();    
		        ans3.setAnswername("Servlet is an Interface");    
		        ans3.setPostedBy("Jai Kumar");    
		            
		        Answer ans4=new Answer();    
		        ans4.setAnswername("Servlet is an API");    
		        ans4.setPostedBy("Arun");    
		            
		        ArrayList<Answer> list1=new ArrayList<Answer>();    
		        list1.add(ans1);    
		        list1.add(ans2);    
		            
		        ArrayList<Answer> list2=new ArrayList<Answer>();    
		        list2.add(ans3);    
		        list2.add(ans4);    
		            
		        Question question1=new Question();    
		        question1.setQname("What is Java?");    
		        question1.setAnswers(list1);    
		            
		        Question question2=new Question();    
		        question2.setQname("What is Servlet?");    
		        question2.setAnswers(list2);    
		            
		        session.persist(question1);    
		        session.persist(question2);    
		            
		        transcation.commit();    
		        session.close();    
		        System.out.println("success");   
			transcation.commit();
			
		}
		catch (Exception e) {
			if(transcation!=null)
			{
				transcation.rollback();
			}
		}
    
    }    
}
