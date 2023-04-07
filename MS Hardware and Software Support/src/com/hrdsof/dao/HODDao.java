package com.hrdsof.dao;

import java.util.List;

import com.hrdsof.dto.EmployeeHODDto;
import com.hrdsof.dto.EngineerDto;
import com.hrdsof.dto.HODDto;
import com.hrdsof.dto.ProblemHODDtoPA;
import com.hrdsof.dto.ProblemHODDtoPNA;
import com.hrdsof.exceptions.EmployeeException;
import com.hrdsof.exceptions.EngineerException;
import com.hrdsof.exceptions.HODException;
import com.hrdsof.exceptions.ProblemException;
import com.hrdsof.model.Engineer;
import com.hrdsof.model.Problem_Temp;



public interface HODDao {
public String loginHOD(HODDto hodDto) throws HODException;
	
	/**
	 * @param engineer
	 * @return
	 * @throws EngineerException
	 */
	public String registerAnEngineer(Engineer engineer) throws EngineerException;
	
	/**
	 * @return
	 * @throws EngineerException
	 */
	public List<EngineerDto> showAllEngineers() throws EngineerException;
	
	/**
	 * @param engID
	 * @return
	 * @throws EngineerException
	 */
	public String removeAnEngineer(int engID) throws EngineerException;
	
	
	/**
	 * @param category
	 * @return
	 * @throws ProblemException
	 */
	// GET ALL PROBLEMS OPEN - IN PROGRESS - CLOSED
	public List<ProblemHODDtoPNA> showAllProblemsNotAssignedToEngineers(String category) throws ProblemException;
	
	/**
	 * @param category
	 * @return
	 * @throws ProblemException
	 */
	public List<ProblemHODDtoPA> showAllProblemsAssignedToEngineers(String category) throws ProblemException;
	
	
	/**
	 * @param engID
	 * @param logID
	 * @param password
	 * @return
	 * @throws ProblemException
	 */
	// ASSIGN ANY PROBLEM TO ANY ENGINEER [NOTE SOFTWARE PROBLEMS TO SOFTWARE ENGG. & HARDWARE PROBLEMS TO HARDWARE ENGG.]
	public String assignAProblemToAnEngineer(int engID, int logID, String password) throws ProblemException;
	
	/**
	 * @return
	 * @throws EmployeeException
	 */
	public List<EmployeeHODDto> showAllUnVerifiedEmployee() throws EmployeeException;
	
	
	
	/**
	 * @param empID
	 * @param password
	 * @return
	 * @throws EmployeeException
	 */
	// APPROVE AN EMPLOYEE
	public String approveAnEmployee(int empID, String password) throws EmployeeException;
	
	
	/**
	 * @param pTemp
	 * @param priority
	 * @param password
	 * @return
	 * @throws ProblemException
	 */
	// SET THE PRIORITY OF A PROBLEM THAT IS NOT LISTED
	public String setPriorityOfANewProblemLaunched(Problem_Temp pTemp, String priority, String password) throws ProblemException;
	
	/**
	 * @return
	 * @throws ProblemException
	 */
	public List<Problem_Temp> getNewProblemDetails() throws ProblemException;
}
