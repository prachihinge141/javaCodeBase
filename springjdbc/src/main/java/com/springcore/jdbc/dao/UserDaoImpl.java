package com.springcore.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springcore.jdbc.entities.User;

public class UserDaoImpl implements UserDao
{
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(User user) {
		//Insert data
		String query="insert into user(userId,userEmail,firstName, lastName,dateOfBirth,companyId, companyName,dateOfJoining,lastLogin) values(?,?,?,?,?,?,?,?,?)";
		int result = this.jdbcTemplate.update(query, user.getUserId(),user.getUserEmail(),user.getFirstName(),user.getLastName(),user.getDateOfBirth(),user.getCompanyId(),
				user.getCompanyName(),user.getDateOfJoining(),user.getLastLogin());
		return result;
	}

	public int update(User user) {
		// Update data
		String query="update user set firstName=? , lastName=? where userId=?";
		int result = this.jdbcTemplate.update(query,user.getFirstName(),user.getLastName(),user.getUserId());
		return result;
	}

	public int delete(int userId) {
		// Delete data
		String query="delete from user where userId=?";
		int result = this.jdbcTemplate.update(query,userId);
		return result;
	}

	public User select(int userId) {
		// Select data
		System.out.println("userid in method: "+userId);
		String query="select * from user where userId=?";
		System.out.println("query: "+query);
		RowMapper<User> rowMapper=new RowMapperImpl();
		User result = this.jdbcTemplate.queryForObject(query, rowMapper,userId);
		System.out.println("inside method result: "+result);
		return result;
	}
	
}
