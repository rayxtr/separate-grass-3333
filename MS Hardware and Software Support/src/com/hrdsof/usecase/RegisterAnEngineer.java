package com.hrdsof.usecase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.hrdsof.dao.HODDao;
import com.hrdsof.dao.HODDaoImpl;
import com.hrdsof.exceptions.EngineerException;
import com.hrdsof.model.Engineer;


public class RegisterAnEngineer {
	public static void regAnEngg() {
        Scanner sc = new Scanner(System.in);
		
		Engineer engineer = new Engineer();
		
		Map<Integer, String> categ = new HashMap<Integer, String>();
		categ.put(1, "SOFTWARE");
		categ.put(2, "HARDWARE");
		
		System.out.print("Enter Name : ");
		engineer.setName(sc.nextLine());
		
		System.out.print("Enter Email : ");
		engineer.setEmail(sc.next());
		
		System.out.print("Enter Password : ");
		engineer.setPassword(sc.next());
		
		System.out.print("Enter Category ( 1 - SOFTWARE 2 - HARDWARE ) : ");
		engineer.setCategory(categ.get(sc.nextInt()));
		
		HODDao dao = new HODDaoImpl();
		
		try {
			String result = dao.registerAnEngineer(engineer);
			System.out.println(result);
		} catch (EngineerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
