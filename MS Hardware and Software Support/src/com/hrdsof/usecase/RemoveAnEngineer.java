package com.hrdsof.usecase;

import java.util.Scanner;

import com.hrdsof.dao.HODDao;
import com.hrdsof.dao.HODDaoImpl;
import com.hrdsof.exceptions.EngineerException;



public class RemoveAnEngineer {
	public static void removeAnEngg() {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Engineer ID : ");
		int engID = sc.nextInt();
		
		HODDao dao = new HODDaoImpl();
		
		try {
			String result = dao.removeAnEngineer(engID);
			System.out.println(result);
		} catch (EngineerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
