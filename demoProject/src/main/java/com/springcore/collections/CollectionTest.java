package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Employee emp=(Employee) context.getBean("emp");
		
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpPhones());
		System.out.println(emp.getEmpAddress());
		System.out.println(emp.getCourse());
		System.out.println(emp.getProps());
		
		System.out.println(emp);

	}

}
