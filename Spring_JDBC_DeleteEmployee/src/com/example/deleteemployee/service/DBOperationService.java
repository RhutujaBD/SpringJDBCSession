package com.example.deleteemployee.service;

import com.example.deleteemployee.inter.DBOperationDAO;

public class DBOperationService {

	private DBOperationDAO dao;

	public void setDao(DBOperationDAO dao) {
		this.dao = dao;
	}

	public String removeEmployeeDetails(int no) {

		int result = dao.delete(no);

		if (result == 0) {

			return no + " Employee record not found";
		} else {

			return " Employee record removed from DB";
		}
	}
}
