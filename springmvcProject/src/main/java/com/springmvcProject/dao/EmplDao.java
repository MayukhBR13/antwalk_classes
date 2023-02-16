package com.springmvcProject.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvcDemo.model.Empl;

public class EmplDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public int save(Empl e) {
		//update 
		int i=(int)this.jdbcTemplate.update("insert into empl (id,name,salary,designation) values (?,?,?,?)", e.getId(),e.getName(),e.getSalary(),e.getDesignation());
		return i;
	}
	public int update(Empl e) {
		//update
		int i=(int)this.jdbcTemplate.update("update empl set name=?,salary=?,designation=? where id=?)", e.getName(),e.getSalary(),e.getDesignation(),e.getId());
		return i;
	}
	public int delete(int id) {
		int i=(int)this.jdbcTemplate.update("delete from empl where id=?)", id);
		return i;
		//update
		
	}
	public Empl getEmpl(int id) {
		//queryForObject->RowMapper
		RowMapper<Empl> rm=new RowMapperImpl();
		Empl e=this.jdbcTemplate.queryForObject("select * from empl where id="+id, rm);
		return e;		
	}
	public List<Empl> getEmployees(){
		String query="select * from empl";
		RowMapper<Empl> rowMapper= new RowMapperImpl();
		List<Empl> student=this.jdbcTemplate.query(query, rowMapper);
		
		return student;
	}
}
