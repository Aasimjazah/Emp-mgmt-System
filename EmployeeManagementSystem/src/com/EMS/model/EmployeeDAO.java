package com.EMS.model;

import java.util.HashMap;
import java.util.Map;

import BeanClasses.EmployeeBean;

public class EmployeeDAO 
{
	Map<Integer, EmployeeBean> map = new HashMap<Integer, EmployeeBean>();
	
	public EmployeeDAO()
	{
		EmployeeBean emp1 = new EmployeeBean();
		EmployeeBean emp2 = new EmployeeBean();
		
		emp1.setEmpId(1001);
		emp1.setName("Jazah");
		emp1.setSalary(25000);
		map.put(emp1.getEmpId(), emp1);
		
		emp2.setEmpId(1002);
		emp2.setName("Ansari");
		emp2.setSalary(25000);
		map.put(emp2.getEmpId(), emp2);
		
	}
	
    public boolean insertData(EmployeeBean emp)
    {
    	boolean status = false;
         if(map.containsKey(emp.getEmpId()))
         {
        	 System.out.println("Already exist");
         }
         else
         {
        	 map.put(emp.getEmpId(), emp);
        	 status = true;
         }
    	return status;
    }
    
    public boolean updateData(int empID, EmployeeBean emp)
    {
    	boolean status = false;
    	if(map.containsKey(empID))
    	{
    		map.put(empID,emp);
    		status = true;
    		
    	}
    	System.out.println("Employee not exist");
    	return status;
    }
    
    public EmployeeBean getData(int empId)
    {
    	EmployeeBean emp = null;
    	if(map.containsKey(empId))
    	{
    		emp = map.get(empId);
    	}
    	
    	return emp;	
    }
    
    public boolean deleteEmpData(int empId)
    {
    	boolean status = false;
    	
    	if(map.containsKey(empId))
    	{
    		map.remove(empId);
    		status = true;
    	}
    	
    	System.out.println("Employee not exist");
    	return status;
    	
    }

}
