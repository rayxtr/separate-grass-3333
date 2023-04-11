package com.hrdsof.usecase;

import java.util.Scanner;

import com.hrdsof.dao.EngineerDao;
import com.hrdsof.dao.EngineerDaoImpl;
import com.hrdsof.exceptions.EngineerException;



public class ChangePassword {
	public static void changePass(int engID) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter New Password : ");
		String newPassword = sc.next();
		
		System.out.print("Enter Old Password : ");
		String oldPassword = sc.next();
		
		EngineerDao dao = new EngineerDaoImpl(); //EngineerDao interface 
		
		try {
			// Changing password for engineer 
			String result = dao.changePassword(engID, newPassword, oldPassword);
			System.out.println("\n" + result);
		} catch (EngineerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
}
}
