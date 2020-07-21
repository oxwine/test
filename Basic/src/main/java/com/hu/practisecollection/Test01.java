package com.hu.practisecollection;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.setId(0301);
//		e.setName("hj");
//		e.setDepartment("项目部");
//		e.setSalary(3000);
//		String strDate = "2007-02-01";
//		
//		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date date = df1.parse(strDate);
//		} catch (ParseException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		Employee e1 = new Employee(0301,"hj",3000,"项目部","2007-10");
		Employee e2 = new Employee(0301,"hj1",3000,"项目部","2007-10");
		Employee e3 = new Employee(0301,"hj2",3000,"项目部","2007-10");
		
		List<Employee> le = new ArrayList<Employee>();
		
		le.add(e1);le.add(e2);le.add(e3);
	}

}
