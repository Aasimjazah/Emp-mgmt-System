package com.EMS.model;

import BeanClasses.EmployeeBean;

public class AdminService 
{
	EmployeeDAO empd = new EmployeeDAO();
	//To insert the employee data
		public boolean insertEmpDetail(EmployeeBean emp)
		{
			boolean status = false;
			
			status = empd.insertData(emp);
			
			return status;	
		}
		
		//To Display the employee data
		public EmployeeBean display(int empID)
		{
			EmployeeBean emp = null;
			emp = empd.getData(empID);
			return emp;
		}
		
		//To Update the employee data
		public boolean updateEmpDetails(int empID, EmployeeBean emp)
		{
			boolean status = false;
			status = empd.updateData(empID, emp);
			
			return status;
		}
		
		//To delete the employee data
		public boolean deleteEmpDetails(int empID)
		{
			boolean status = false;
			status = empd.deleteEmpData(empID);
			return status;
			
		}
	

}
