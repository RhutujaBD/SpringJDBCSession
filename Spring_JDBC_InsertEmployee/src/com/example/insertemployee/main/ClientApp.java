package com.example.insertemployee.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.insertemployee.service.DBOperationService;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext =

				new FileSystemXmlApplicationContext("src\\com\\example\\insertemployee\\config\\applicationContext.xml");

		DBOperationService dbOperationService = (DBOperationService) applicationContext.getBean("dbService");

		System.out.println(dbOperationService.createEmployee(19, "Sanvi", "Doctor", 80000));
	}
}
