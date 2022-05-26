package com.edubridge.wiredMySpring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com.edubridge.wiredMySpring");
		
	    Employee employee=(Employee)(applicationContext.getBean("employee"));
	    System.out.println(employee);
 employee.employeeAddress();
 
 
		//System.out.println(employee1);)
	}

}
