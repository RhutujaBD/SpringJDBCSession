package com.example.employeedetail.inter;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationDAO implements DBOperation {

	private static final String GET_EMPLOYEE_DETAILS_BY_ID = "SELECT * FROM EMPLOYEE_JDBC WHERE EMP_ID=?";

	private static final String GET_ALL_EMPLOYEE_DATAILS = "SELECT EMP_ID,EMP_NAME,EMP_JOB,EMP_SALARY FROM EMPLOYEE_JDBC";

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Map<String, Object> listEmployeeList(int no) {

		Map<String, Object> map = jdbcTemplate.queryForMap(GET_EMPLOYEE_DETAILS_BY_ID, no);

		return map;
	}

	@Override
	public List<Map<String, Object>> listAllEmployee() {

		List<Map<String, Object>> map = jdbcTemplate.queryForList(GET_ALL_EMPLOYEE_DATAILS);

		return map;
	}
}
