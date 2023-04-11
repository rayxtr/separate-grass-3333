package com.hrdsof.main;

import java.util.Scanner;

import com.hrdsof.usecase.ApproveEmployee;
import com.hrdsof.usecase.AssignAComplaintToAnEngineer;
import com.hrdsof.usecase.ChangePassword;
import com.hrdsof.usecase.ChangePasswordEmp;
import com.hrdsof.usecase.GetAndSetNewProblem;
import com.hrdsof.usecase.GetComplaintHistory;
import com.hrdsof.usecase.LoginEmployee;
import com.hrdsof.usecase.LoginEngineer;
import com.hrdsof.usecase.LoginHOD;
import com.hrdsof.usecase.RegisterAComplaint;
import com.hrdsof.usecase.RegisterAnEngineer;
import com.hrdsof.usecase.RegisterEmployee;
import com.hrdsof.usecase.RemoveAnEngineer;
import com.hrdsof.usecase.ShowAllComplaints;
import com.hrdsof.usecase.ShowAllEngineers;
import com.hrdsof.usecase.ShowComplaintStatus;
import com.hrdsof.usecase.ShowProblemsAssigned;
import com.hrdsof.usecase.UpdateProblemStatus;



public class Main {

	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
				+ "|	 Welcome To MS Hardware And Software Support  |\n"
				+ "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");

		
		boolean i1 = true;
		
		while(i1) {
			System.out.println("\n\n"
					+ " *******************************\n"
					+ "[                              ]\n"
					+ "[ Tell Me Who are You?        ]\n"
					+ "[   1 - HOD                    ]\n"
					+ "[   2 - Engineer               ]\n"
					+ "[   3 - Employee               ]\n"
					+ "[   4 - Exit                   ]\n"
					+ "[*******************************]\n");
			
			System.out.print("Enter Your Choice : ");
			int ch1 = sc.nextInt();
			
			switch(ch1) {
			case 1: System.out.println("\n\nHOD Login");
			        System.out.println("=========");
			        
			        //Checking if HOD is login.
			        if(LoginHOD.logHOD()) {
			        	boolean i2 = true;
			        	
			        	while(i2) {
			        		System.out.println("\n\n"
			        				+ "______________________________________________\n"
			    					+ "|                                            |\n"
			        				+ "| Please Select Correct Option               |\n"
			    					+ "|   1 - Register An Engineer                 |\n"
			        				+ "|   2 - Show All Engineers                   |\n"
			    					+ "|   3 - Remove An Engineer                   |\n"
			        				+ "|   4 - Show All Complaints                  |\n"
			    					+ "|   5 - Assign A Complaint To An Engineer    |\n"
			        				+ "|   6 - Set Priority Of A Complaint          |\n"
			    					+ "|   7 - Approve An Employee                  |\n"
			        				+ "|   8 - Exit                                 |\n"
			        				+ "|____________________________________________|\n");
			        		System.out.print("Enter Your Choice : ");
			    			int ch2 = sc.nextInt();
			    			
			    			switch(ch2) {
			    			case 1: 
			    				System.out.println("\n\nRegister An Engineer");
			    			    System.out.println("====================");
			    			    RegisterAnEngineer.regAnEngg();
			    			    break;        
			    			case 2:
			    				System.out.println("\n\nShow All Engineers ");
			    				System.out.println("==================");
			    				ShowAllEngineers.showAllEngg();
			    				break;
			    			case 3:
			    				System.out.println("\n\nRemove An Engineer");
			    				System.out.println("==================");
			    				RemoveAnEngineer.removeAnEngg();
			    				break;
			    			case 4:
			    				System.out.println("\n\nShow All Complaints ");
			    				System.out.println("===================");
			    				ShowAllComplaints.showAllCompl();
			    				break;
			    			case 5:
			    				System.out.println("\n\nAssign A Complaint To An Engineer");
			    				System.out.println("================================");
			    				AssignAComplaintToAnEngineer.assignAComplToAnEngg();
			    				break;
			    			case 6:
			    				System.out.println("\n\nSet Priority Of A Complaint ");
			    				System.out.println("===========================");
			    				GetAndSetNewProblem.setPriorityOfAComp();
			    				break;
			    			case 7:
			    				System.out.println("\n\nApprove An Employee ");
			    				System.out.println("===================");
			    				ApproveEmployee.approveAnEmp();
			    				break;
			    			case 8:
			    				i2 = false;
			    				break;
			    			default:
			    				System.out.println("\n\nWrong Choice...");
			    			}
			        	}
			        }
			        break;
			        
			case 2: System.out.println("\n\nEngineer Login");
	                System.out.println("==============");
	                int engID = LoginEngineer.loginEngg(); //Checking if Engineer is logged in.
	                if(engID != 0) {
	                	boolean i2 = true;
	                	while(i2) {
	                		System.out.println("\n\n"
			        				+ "______________________________________________\n"
			    					+ "|                                            |\n"
			        				+ "| Please Select Correct Option               |\n"
			    					+ "|   1 - Show All Complaints Assigned By HOD  |\n"
			        				+ "|   2 - Update Complaint Status              |\n"
			    					+ "|   3 - Show All Complaints Attended By Him  |\n"
			        				+ "|   4 - Change Password                      |\n"
			    					+ "|   5 - Exit                                 |\n"
			        				+ "|____________________________________________|\n");
			        		System.out.print("Enter Your Choice : ");
			    			int ch2 = sc.nextInt();
			    			
			    			switch(ch2) {
			    			case 1: 
			    				System.out.println("\n\nShow All Complaints Assigned By HOD");
			    			    System.out.println("===================================");
			    			    ShowProblemsAssigned.showProbAssign(engID);
			    			    break;        
			    			case 2:
			    				System.out.println("\n\nUpdate Complaint Status");
			    				System.out.println("=======================");
			    				UpdateProblemStatus.updateProbStat(engID);
			    				break;
			    			case 3:
			    				System.out.println("\n\nShow All Complaints Attended By Him");
			    				System.out.println("===================================");
			    				ShowProblemsAssigned.showProbAssign(engID);
			    				break;
			    			case 4:
			    				System.out.println("\n\nChange Password");
			    				System.out.println("===============");
			    				ChangePassword.changePass(engID);
			    				break;
			    			case 5:
			    				i2 = false;
			    				break;
			    			default:
			    				System.out.println("\n\nWrong Choice...");
			    			}
	                	}
	                }
	                break;
	                
			case 3: 
				boolean i2 = true;
				
				while(i2) {
					System.out.println("\n\n"
	        				+ "________________________________\n"
	    					+ "|                              |\n"
	        				+ "| Please Select Correct Option |\n"
	    					+ "|   1 - Register               |\n"
	        				+ "|   2 - Login                  |\n"
	    					+ "|   3 - Exit                   |\n"
	        				+ "|______________________________|\n");
					System.out.print("Enter Your Choice : ");
	    			int ch2 = sc.nextInt();
				    switch(ch2) {
				    case 1:
				    	System.out.println("\n\nRegister Employee");
	    				System.out.println("=================");
	    				RegisterEmployee.registerEmp();
				    	break;
				    case 2:
				    	System.out.println("\n\nLogin Employee");
	    				System.out.println("==============");
	    				int empID = LoginEmployee.loginEmp();
	    				if(empID != 0) {
	    					boolean i3 = true;
		                	while(i3) {
		                		System.out.println("\n\n"
				        				+ "________________________________\n"
				    					+ "|                              |\n"
				        				+ "| Please Select Correct Option |\n"
				    					+ "|   1 - Register A Complaint   |\n"
				        				+ "|   2 - Show Complaint Status  |\n"
				    					+ "|   3 - Complaint History      |\n"
				        				+ "|   4 - Change Password        |\n"
				    					+ "|   5 - Exit                   |\n"
				        				+ "|______________________________|\n");
				        		System.out.print("Enter Your Choice : ");
				    			int ch3 = sc.nextInt();
				    			
				    			switch(ch3) {
				    			case 1:
				    				System.out.println("\n\nRegister A Complaint"
				    						+ "\n====================");
				    				RegisterAComplaint.registerAComp(empID);
				    				break;
				    			case 2:
				    				System.out.println("\n\nShow Complaint Status"
				    						+ "\n=====================");
				    				ShowComplaintStatus.showCompStat(empID);
				    				break;
				    			case 3:
				    				System.out.println("\n\nComplaint History"
				    						+ "\n=================");
				    				GetComplaintHistory.getCompHist(empID);
				    				break;
				    			case 4:
				    				System.out.println("\n\nChange Password"
				    						+ "\n===============");
				    				ChangePasswordEmp.changePassEmp(empID);
				    				break;
				    			case 5:
				    				i3 = false;
				    				break;
				    			default:
				    				System.out.println("\n\nWrong Choice...");
				    			}
		                	}
	    				}
				    	break;
				    case 3: 
				    	i2 = false;
				    	break;
				    default: 
				    	System.out.println("\n\nWrong Choice...");
				    }
				}
				
                break;
                    
			case 4: System.out.println("\n\nThank You For Using Our Application...");
			        i1 = false;
			        break;
			        
			default: System.out.println("\n\nWrong Choice...");
			}
		}
		sc.close();
	}

}
