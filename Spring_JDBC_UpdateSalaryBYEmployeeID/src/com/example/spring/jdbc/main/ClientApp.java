package com.example.spring.jdbc.main;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.spring.jdbc.service.DBOperationService;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext =

				new FileSystemXmlApplicationContext("src\\com\\example\\spring\\jdbc\\config\\applicationContext.xml");

		DBOperationService dbOperationService = (DBOperationService) applicationContext.getBean("dbService");

		System.out.println(dbOperationService.hikeSalary(5));

	}

}
