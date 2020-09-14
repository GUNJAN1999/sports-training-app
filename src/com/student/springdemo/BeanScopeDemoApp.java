package com.student.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp
{

	public static void main(String[] args)
	{
		// TODO load spring config file
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// TODO RETRIEVE BEAN FROM CONTAINER
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		//TODO check if they are same bean
		boolean result=(theCoach==alphaCoach);
		
		//TODO PRINTING THE RESULTS
		System.out.println(" the resut is :"+result);
		System.out.println(" the memory location of theCoach is :"+theCoach);
		System.out.println(" the memory location of alphaCoach is :"+alphaCoach);
		
	}

}
