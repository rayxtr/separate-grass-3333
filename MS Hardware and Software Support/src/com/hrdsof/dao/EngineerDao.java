package com.hrdsof.dao;

import java.util.List;

import com.hrdsof.dto.EngineerDtoCred;
import com.hrdsof.dto.ProblemENggDto;
import com.hrdsof.exceptions.EngineerException;
import com.hrdsof.exceptions.ProblemException;



/**
 * @author madhu
 *
 */
public interface EngineerDao {

public int loginEngineer(EngineerDtoCred cred) throws EngineerException;
	
	/**
	 * @param engID
	 * @param status
	 * @return
	 * @throws ProblemException
	 */
    //Shows problem Assign by hod to engineer
	public List<ProblemENggDto> showProblemsAssigned(int engID, String status) throws ProblemException;
	
	/**
	 * @param complainID
	 * @param status
	 * @param engID
	 * @param password
	 * @return
	 * @throws ProblemException
	 */
	//Update problem status if solved or not by engineer.
	public String updateProblemStatus(int complainID, String status, int engID, String password) throws ProblemException;
	
	/**
	 * @param engID
	 * @param newPassword
	 * @param oldPassword
	 * @return
	 * @throws EngineerException
	 */
	//Engineer can change password.
	public String changePassword(int engID, String newPassword, String oldPassword) throws EngineerException;
	
	
	
}
