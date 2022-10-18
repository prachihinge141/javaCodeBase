package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml"); // setter method run honar aani values set honar
        Student student1= (Student) context.getBean("student1");
        String nme = student1.getStudentName();
        System.out.println(nme);
        
        System.out.println(student1);
    }
}
