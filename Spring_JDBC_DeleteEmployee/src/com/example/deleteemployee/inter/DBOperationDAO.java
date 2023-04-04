package com.example.deleteemployee.inter;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationDAO implements DBOperation {

	private static final String  DELETE_EMPLOYEE_JDBC ="DELETE FROM EMPLOYEE_JDBC  WHERE EMP_ID = ?";
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int delete(int no) {

		int result = jdbcTemplate.update(DELETE_EMPLOYEE_JDBC,no);
		
		return result;
	}

}
