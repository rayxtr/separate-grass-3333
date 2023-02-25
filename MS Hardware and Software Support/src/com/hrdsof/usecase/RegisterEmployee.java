package com.hrdsof.usecase;

import java.util.Scanner;

import com.hrdsof.dao.EmployeeDao;
import com.hrdsof.dao.EmployeeDaoImpl;
import com.hrdsof.dto.EmployeeDtoReg;
import com.hrdsof.exceptions.EmployeeException;



public class RegisterEmployee {
	public static void registerEmp() {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Your Email : ");
		String email = sc.nextLine();
		
		System.out.print("Enter Your Password : ");
		String password = sc.nextLine();
		
		EmployeeDtoReg dtoReg = new EmployeeDtoReg(name, email, password, "UNVERIFIED");
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			String result = dao.registerEmployee(dtoReg);
			System.out.println("\n" + result);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
