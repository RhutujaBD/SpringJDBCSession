package com.example.employeedetail.inter;

import java.util.List;
import java.util.Map;

public interface DBOperation {

	public Map<String, Object> listEmployeeList(int no);

	public List<Map<String, Object>> listAllEmployee();

}
