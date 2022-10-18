package com.springcore.jdbc;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.dao.UserDao;
import com.springcore.jdbc.entities.User;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
    	UserDao ud = context.getBean("userimpl",UserDao.class);
    	
    	Date dob = null;
		try {
			dob = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("1987-12-23");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date doj=null;
		try {
			doj = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-21");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = "2022-10-09 11:30"; 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); 
		LocalDateTime lastLoginDatetime = LocalDateTime.parse(str, formatter);

		
		
    	
    	User user=new User();
    	
//    	user.setUserId(114);
//    	user.setUserEmail("test00@gmail.com");
//    	user.setFirstName("Nisha");
//    	user.setLastName("Dev");
//    	user.setDateOfBirth(dob);
//    	user.setCompanyId(2003);
//    	user.setCompanyName("Company3");
//    	user.setDateOfJoining(doj);
//    	user.setLastLogin(lastLoginDatetime);
//    	
//    	int r = ud.insert(user);
//    	System.out.println("Number of record inserted: "+r);
//		
//		//User user=new User();
//		user.setUserId(1);
//		user.setFirstName("Tusharrr");
//		user.setLastName("Kapoor");
//		
//		int r1 = ud.update(user);
//		System.out.println("Number of record updated: "+r1);
//		
//		int r2 = ud.delete(1);
//		System.out.println("Number of records deleted: "+r2);
    	
    	User r3 = ud.select(20);
    	System.out.println("Record fetch: "+r3);
		
		
    	
    }
}
