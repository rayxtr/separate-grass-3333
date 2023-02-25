package com.hrdsof.usecase;

import java.util.Scanner;

import com.hrdsof.dao.EmployeeDao;
import com.hrdsof.dao.EmployeeDaoImpl;
import com.hrdsof.exceptions.ProblemException;



public class ShowComplaintStatus {
	public static void showCompStat(int empID) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Complaint ID : ");
		int logID = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			String result = dao.showComplaintStatus(logID, empID);
			System.out.println("\n" + result);
		} catch (ProblemException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
