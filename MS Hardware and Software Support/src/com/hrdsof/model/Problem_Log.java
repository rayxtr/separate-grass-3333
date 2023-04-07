package com.hrdsof.model;

public class Problem_Log {
	private int logID;
	private int probID;
	private int empID;
	private int engID;
	private String status;
	private String launchedOn;
	private String StartedWorking;
	private String ClosedOn;
	
	public Problem_Log() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param logID
	 * @param probID
	 * @param empID
	 * @param engID
	 * @param status
	 * @param launchedOn
	 * @param startedWorking
	 * @param closedOn
	 */
	public Problem_Log(int logID, int probID, int empID, int engID, String status, String launchedOn,
			String startedWorking, String closedOn) {
		super();
		this.logID = logID;
		this.probID = probID;
		this.empID = empID;
		this.engID = engID;
		this.status = status;
		this.launchedOn = launchedOn;
		StartedWorking = startedWorking;
		ClosedOn = closedOn;
	}

	public int getLogID() {
		return logID;
	}

	public void setLogID(int logID) {
		this.logID = logID;
	}

	public int getProbID() {
		return probID;
	}

	public void setProbID(int probID) {
		this.probID = probID;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getEngID() {
		return engID;
	}

	public void setEngID(int engID) {
		this.engID = engID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLaunchedOn() {
		return launchedOn;
	}

	public void setLaunchedOn(String launchedOn) {
		this.launchedOn = launchedOn;
	}

	public String getStartedWorking() {
		return StartedWorking;
	}

	public void setStartedWorking(String startedWorking) {
		StartedWorking = startedWorking;
	}

	public String getClosedOn() {
		return ClosedOn;
	}

	public void setClosedOn(String closedOn) {
		ClosedOn = closedOn;
	}

	@Override
	public String toString() {
		return "Problem_Log [logID=" + logID + ", probID=" + probID + ", empID=" + empID + ", engID=" + engID
				+ ", status=" + status + ", launchedOn=" + launchedOn + ", StartedWorking=" + StartedWorking
				+ ", ClosedOn=" + ClosedOn + "]";
	}

}
