package com.example.employeedetail.service;

import java.util.List;
import java.util.Map;

import com.example.employeedetail.inter.DBOperationDAO;

public class DBOperationService {

	private DBOperationDAO dao;

	public void setDao(DBOperationDAO dao) {
		this.dao = dao;
	}

	public Map<String, Object> getEmployeeDetails(int no) throws Exception {
		System.out.println("**** ****************** " + no);
		Map<String, Object> employeeDetails = dao.listEmployeeList(no);

		if (employeeDetails != null) {

			return employeeDetails;
		} else {

			throw new Exception(no + " Employee found in DB");
		}
	}

	public List<Map<String, Object>> getAllEmployeeDetails() throws Exception {
		List<Map<String, Object>> employeeDetailsList = dao.listAllEmployee();

		if (employeeDetailsList != null) {

			return employeeDetailsList;
		} else {

			throw new Exception(" Employees found in DB");
		}
	}
}
