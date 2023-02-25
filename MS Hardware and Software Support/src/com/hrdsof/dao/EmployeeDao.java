package com.hrdsof.dao;

import java.util.List;

import com.hrdsof.dto.EmployeeDtoCred;
import com.hrdsof.dto.EmployeeDtoReg;
import com.hrdsof.dto.ProblemEmpHistDto;
import com.hrdsof.exceptions.EmployeeException;
import com.hrdsof.exceptions.ProblemException;


public interface EmployeeDao {
public String registerEmployee(EmployeeDtoReg dtoReg) throws EmployeeException;
	
	public int loginEmployee(EmployeeDtoCred cred) throws EmployeeException;
	
	public String registerAComplain(int empID, String password, int probID) throws ProblemException;
	
	public String showComplaintStatus(int complaintID, int empID) throws ProblemException;
	
	public List<ProblemEmpHistDto> getComplaintHistory(int empID) throws ProblemException;
	
	public String registerANewComplain(int empID, String password, String probDesc, String category) throws ProblemException;
	
	public String changePassword(int empID, String newPassword, String oldPassword) throws EmployeeException;

}
