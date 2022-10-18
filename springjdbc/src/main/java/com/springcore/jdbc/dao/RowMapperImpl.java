package com.springcore.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcore.jdbc.entities.User;

public class RowMapperImpl implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	
		User user=new User();
		user.setUserId(rs.getInt(1));
		user.setUserEmail(rs.getString(2));
		user.setFirstName(rs.getString(3));
		user.setLastName(rs.getString(4));
		user.setDateOfBirth(rs.getDate(5));
		user.setCompanyId(rs.getInt(6));
		user.setCompanyName(rs.getString(7));
		user.setDateOfJoining(rs.getDate(8));
		user.setLastLogin(rs.getTimestamp(9).toLocalDateTime());
		return user;
	}

}
