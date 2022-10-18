package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/constInjConfig.xml");
		Person per = (Person) context.getBean("per");
		System.out.println(per);
		
		Addition add=(Addition) context.getBean("add");
		add.show();
		
		
	}

}
