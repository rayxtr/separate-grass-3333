package com.hrdsof.usecase;

import java.util.Scanner;

import com.hrdsof.dao.HODDao;
import com.hrdsof.dao.HODDaoImpl;
import com.hrdsof.exceptions.ProblemException;


public class AssignAComplaintToAnEngineer {
	public static void assignAComplToAnEngg() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Engineer ID : ");
		int engID = sc.nextInt();
		
		System.out.print("Enter Complaint ID : ");
		int logID = sc.nextInt();
		
		System.out.print("Enter Your Password : ");
		String password = sc.next();
		
		HODDao dao = new HODDaoImpl();
		
		try {
			//Assigning a problem to engineer.
			String result = dao.assignAProblemToAnEngineer(engID, logID, password); 
			System.out.println("\n" + result);
		} catch (ProblemException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
