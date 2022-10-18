package com.springcore.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Lifecycle/lifecycleConfig.xml");
//Kachori lf=(Kachori) context.getBean("lf");
//System.out.println(lf);
		context.registerShutdownHook();
		
//Pepsi p1= (Pepsi) context.getBean("p1");
	//System.out.println(p1);

	Samosa s1=(Samosa) context.getBean("s1");
	System.out.println(s1);
	

	}

}
