package com.example.spring.jdbc.inter;

public interface DBOperation {

	public int getSalaryById(int no);

	public int updateEmployeeSalaryById(int no, int newSalary);

}
