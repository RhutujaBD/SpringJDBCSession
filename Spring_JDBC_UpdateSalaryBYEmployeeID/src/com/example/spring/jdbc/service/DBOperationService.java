package com.example.spring.jdbc.service;

import com.example.spring.jdbc.inter.DBOperationDAO;

public class DBOperationService {

	private DBOperationDAO dao;

	public void setDao(DBOperationDAO dao) {
		this.dao = dao;
	}

	public String hikeSalary(int no) {
		int newSalary = 0;
		try {
		int salary = dao.getSalaryById(no);
		
		System.out.println();
		
		
		 if(salary < 52800) {
			 
			 newSalary = Math.round(salary+(salary*0.10f));
			 System.out.println("1% "+newSalary);
		 }else {
			 
			 newSalary = Math.round(salary+(salary*0.20f));
			 System.out.println("2% "+newSalary);
		 }
		
		 
		}catch(Exception e) {
			e.printStackTrace();
		}
		int result = dao.updateEmployeeSalaryById(no, newSalary);
		 if(result == 0) {
				
				return no +" Employee Salary not hiked";
		}else {
				
				return no +" Employee Salary is hike ";
			}
		 
		
	}
	
}

