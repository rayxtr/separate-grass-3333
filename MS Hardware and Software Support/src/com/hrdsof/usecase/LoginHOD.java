package com.hrdsof.usecase;

import java.util.Scanner;

import com.hrdsof.dao.HODDao;
import com.hrdsof.dao.HODDaoImpl;
import com.hrdsof.dto.HODDto;
import com.hrdsof.exceptions.HODException;


public class LoginHOD {
	public static boolean logHOD() {
		boolean flag = false;
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter email : ");
		String email = sc.next();
		
		System.out.print("Enter password : ");
		String password = sc.next();
		
		HODDto hodDto = new HODDto(email, password);
		
		HODDao dao = new HODDaoImpl();
		
		try {
			String result = dao.loginHOD(hodDto);
			System.out.println("\n" + result);
			if(result == "Logged In Successfully...")
				flag = true;
		} catch (HODException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return flag;
	}
}
