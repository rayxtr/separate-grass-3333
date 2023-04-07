package com.hrdsof.usecase;

import java.util.Scanner;

import com.hrdsof.dao.HODDao;
import com.hrdsof.dao.HODDaoImpl;
import com.hrdsof.exceptions.EmployeeException;



/**
 * @author madhu
 *
 */
public class ApproveEmployee {
	
	public static void approveAnEmp() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID : ");
		int empID = sc.nextInt();
		
		System.out.print("Enter Your Password : ");
		String password = sc.next();
		
		HODDao dao = new HODDaoImpl();  //HOD DAO interface for using methods
		
		try {
			String result = dao.approveAnEmployee(empID, password); //Approve Employee by id and password
			System.out.println("\n" + result);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
