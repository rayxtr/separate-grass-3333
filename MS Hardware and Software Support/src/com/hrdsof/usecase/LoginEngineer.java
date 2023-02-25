package com.hrdsof.usecase;

import java.util.Scanner;

import com.hrdsof.dao.EngineerDao;
import com.hrdsof.dao.EngineerDaoImpl;
import com.hrdsof.dto.EngineerDtoCred;
import com.hrdsof.exceptions.EngineerException;



public class LoginEngineer {
	public static int loginEngg() {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Email : ");
		String email = sc.next();
		
		System.out.print("Enter Your Password : ");
		String password = sc.next();
		
		EngineerDtoCred cred = new EngineerDtoCred(email, password);
		
		EngineerDao dao = new EngineerDaoImpl();
		
		int engID = 0;
		
		try {
			engID = dao.loginEngineer(cred);
			if(engID != 0)
				System.out.println("Logged In Successfully...");
			
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
		
		return engID;
	}
}
