package com.edubridge.mySpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// resource
		Resource resource = new ClassPathResource("applicationcontext.xml");

		// bean factory interface
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Student student = beanFactory.getBean(Student.class);
		student.readData();

		// new object creating manually
		student = new Student("Lakshmi", 100);
		// giving values to the object by xml property to container assign the value
		// values are printing which given in property

		// by setter insertion
		 System.out.println(student);

		/*
		 * Employee employee = beanFactory.getBean(Employee.class); manually giving
		 * values to object employee.setEmpId(100); employee.setMobNo("9688566307");
		 * employee.setName("Lakshmi");
		 * 
		 * 
		 * //by constructor insertion System.out.println(employee);
		 * 
		 * Address address = beanFactory.getBean(Address.class);
		 */
	}

}
