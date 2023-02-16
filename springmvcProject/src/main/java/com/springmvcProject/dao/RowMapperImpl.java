package com.springmvcProject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvcDemo.model.Empl;

public class RowMapperImpl implements RowMapper<Empl> {

	public Empl mapRow(ResultSet rs, int rowNum) throws SQLException {
		Empl student = new Empl();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setSalary(rs.getInt(3));
		student.setDesignation(rs.getString(4));
		return student;
	}
	
}
