package com.hrdsof.usecase;

import java.util.Scanner;

import com.hrdsof.dao.EmployeeDao;
import com.hrdsof.dao.EmployeeDaoImpl;
import com.hrdsof.dto.EmployeeDtoCred;
import com.hrdsof.exceptions.EmployeeException;

public class LoginEmployee {
	public static int loginEmp() {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Email : ");
		String email = sc.next();
		
		System.out.println("Enter Password : ");
		String password = sc.next();
		
		EmployeeDtoCred cred = new EmployeeDtoCred(email, password);
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		int empID = 0;
		
		try {
			empID = dao.loginEmployee(cred);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		return empID;
	}
}
