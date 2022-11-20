package com.EMS.controller;

import com.EMS.model.AdminService;

import BeanClasses.EmployeeBean;


public class AdminController 
{
	AdminService as = new AdminService();
	//To insert the employee data
	public boolean insertEmpDetail(EmployeeBean emp)
	{
		boolean status = false;
		
		status = as.insertEmpDetail(emp);
		return status;	
	}
	
	//To Display the employee data
	public EmployeeBean display(int empID)
	{
		EmployeeBean emp = null;
		
		emp = as.display(empID);
		return emp;
	}
	
	//To Update the employee data
	public boolean updateEmpDetails(int empID, EmployeeBean emp)
	{
		boolean status = false;
		
		status = as.updateEmpDetails(empID, emp);
		return status;
	}
	
	//To delete the employee data
	public boolean deleteEmpDetails(int empID)
	{
		boolean status = false;

		status = as.deleteEmpDetails(empID);
		return status;
		
	}
	

}
