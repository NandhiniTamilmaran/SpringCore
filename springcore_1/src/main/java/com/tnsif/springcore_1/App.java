package com.tnsif.springcore_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;s
public class App 
{
	public static void main(String[] args) {
    	//It is the IOC container
    	//It reads and manages the beans
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");
        College col = (College)context.getBean("CollegeBean");
        col.show();
        
  }
}
