package com.hrdsof.usecase;

import java.util.ArrayList;
import java.util.List;

import com.hrdsof.dao.EmployeeDao;
import com.hrdsof.dao.EmployeeDaoImpl;
import com.hrdsof.dto.ProblemEmpHistDto;
import com.hrdsof.exceptions.ProblemException;


public class GetComplaintHistory {
	public static void getCompHist(int empID) {
		List<ProblemEmpHistDto> dtos = new ArrayList<>();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			dtos = dao.getComplaintHistory(empID);
			System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
			System.out.printf("%-20s%-25s%-12s%-30s%-20s%-20s", "ComplainID", "Description", "empID", "Launched On", "Category", "Status");
			System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
			
			dtos.forEach(d -> {
				System.out.printf("%-20s%-25s%-12s%-30s%-20s%-20s\n", d.getLogID(), d.getProbDesc(), d.getEmpID(), d.getLaunchedOn(), d.getCategory(), d.getStatus());
			
			});
		} catch (ProblemException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
}
}
