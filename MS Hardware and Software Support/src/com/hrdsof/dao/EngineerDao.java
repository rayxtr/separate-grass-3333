package com.hrdsof.dao;

import java.util.List;

import com.hrdsof.dto.EngineerDtoCred;
import com.hrdsof.dto.ProblemENggDto;
import com.hrdsof.exceptions.EngineerException;
import com.hrdsof.exceptions.ProblemException;



public interface EngineerDao {

public int loginEngineer(EngineerDtoCred cred) throws EngineerException;
	
	public List<ProblemENggDto> showProblemsAssigned(int engID, String status) throws ProblemException;
	
	public String updateProblemStatus(int complainID, String status, int engID, String password) throws ProblemException;
	
	public String changePassword(int engID, String newPassword, String oldPassword) throws EngineerException;
	
	
	
}
