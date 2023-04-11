package com.hrdsof.dao;

import java.util.List;

import com.hrdsof.dto.EmployeeDtoCred;
import com.hrdsof.dto.EmployeeDtoReg;
import com.hrdsof.dto.ProblemEmpHistDto;
import com.hrdsof.exceptions.EmployeeException;
import com.hrdsof.exceptions.ProblemException;

/*
 * Database Operations Methods interface.
 */
public interface EmployeeDao {
public String registerEmployee(EmployeeDtoReg dtoReg) throws EmployeeException;
	
	/**
	 * @param cred
	 * @return
	 * @throws EmployeeException
	 */
// Validating employee for login.
	public int loginEmployee(EmployeeDtoCred cred) throws EmployeeException;
	
	/**
	 * @param empID
	 * @param password
	 * @param probID
	 * @return
	 * @throws ProblemException
	 */
	//Employee can register complaint.
	public String registerAComplain(int empID, String password, int probID) throws ProblemException;
	
	/**
	 * @param complaintID
	 * @param empID
	 * @return
	 * @throws ProblemException
	 */
	//Emplyee can check status of complaint if it is resolved or not.
	public String showComplaintStatus(int complaintID, int empID) throws ProblemException;
	
	/**
	 * @param empID
	 * @return
	 * @throws ProblemException
	 */
	// List of complaint history
	public List<ProblemEmpHistDto> getComplaintHistory(int empID) throws ProblemException;
	
	/**
	 * @param empID
	 * @param password
	 * @param probDesc
	 * @param category
	 * @return
	 * @throws ProblemException
	 */
	//Register a new Complain
	public String registerANewComplain(int empID, String password, String probDesc, String category) throws ProblemException;
	
	/**
	 * @param empID
	 * @param newPassword
	 * @param oldPassword
	 * @return
	 * @throws EmployeeException
	 */
	//Employee can change password.
	public String changePassword(int empID, String newPassword, String oldPassword) throws EmployeeException;

}
