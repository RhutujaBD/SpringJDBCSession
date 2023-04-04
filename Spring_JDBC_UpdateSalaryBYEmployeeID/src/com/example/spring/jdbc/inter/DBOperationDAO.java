package com.example.spring.jdbc.inter;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationDAO implements DBOperation {

	private static final String GET_EMPLOYEE_SALARY_BY_ID = "SELECT EMP_SALARY FROM  EMPLOYEE_JDBC WHERE EMP_ID=?";

	private static final String UPDATE_EMPLOYE_SALARY_BY_ID = "UPDATE EMPLOYEE_JDBC  SET EMP_SALARY=? WHERE EMP_ID=?";

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int getSalaryById(int no) {

		int salary = jdbcTemplate.queryForInt(GET_EMPLOYEE_SALARY_BY_ID, no);
		System.out.println("*******DAO******** " + salary);
		return salary;
	}

	@Override
	public int updateEmployeeSalaryById(int no, int newSalary) {
		System.out.println(no + "     " + newSalary);
		int result = jdbcTemplate.update(UPDATE_EMPLOYE_SALARY_BY_ID, newSalary, no);

		return result;
	}

}
