package com.EMS.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.EMS.model.EmployeeDAO;

import BeanClasses.EmployeeBean;

public class EmployeeDAOTest {

	EmployeeDAO ed = new EmployeeDAO ();
	@Test
	@Order(1)
	public void testInsertData() {
		   int empID = 1000;
		   String name = "Aasim";
		   float salary = 25000f;
		   EmployeeBean emp = new EmployeeBean();
		   emp.setEmpId(empID);
		   emp.setName(name);
		   emp.setSalary(salary);
		  boolean status =  ed.insertData(emp);
		  
		  assertTrue(status);
	}

	@Test
	@Order(2)
	public void testUpdateData() 
	{
		
		   int empID = 1000;
		   String name = "Aasim";
		   float salary = 25000f;
		   EmployeeBean emp = new EmployeeBean();
		   emp.setEmpId(empID);
		   emp.setName(name);
		   emp.setSalary(salary);
		   ed.updateData(empID, emp);
	}

	@Test
	@Order(3)
	public void testGetData() {
		int empID = 1001;
		
		EmployeeBean emp = ed.getData(empID);
		
		assertNotEquals(null, emp);
		
	}

	@Test
	@Order(4)
	public void testDeleteEmpData() {
		int empID = 1001;
		
		boolean status = ed.deleteEmpData(empID);
		assertTrue(status);
	}

}
