package com.hrdsof.usecase;

import java.util.Scanner;

import com.hrdsof.dao.EmployeeDao;
import com.hrdsof.dao.EmployeeDaoImpl;
import com.hrdsof.exceptions.EmployeeException;



public class ChangePasswordEmp {
	public static void changePassEmp(int empID) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter New Password : ");
		String newPassword = sc.next();
		
		System.out.print("Enter Old Password : ");
		String oldPassword = sc.next();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			String result = dao.changePassword(empID, newPassword, oldPassword);
			System.out.println("\n" + result);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
