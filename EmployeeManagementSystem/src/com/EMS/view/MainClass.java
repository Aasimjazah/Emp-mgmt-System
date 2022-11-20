package com.EMS.view;

import java.util.Scanner;

import com.EMS.controller.AdminController;

import BeanClasses.EmployeeBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
	   AdminController ac = new AdminController();
	   System.out.println("Employee Management System");
	   Scanner sc = new Scanner(System.in);
	   do
	   {
		   System.out.println("Press 1->Insert, 2->Update, 3->display, 4->Delete");
		   int option = sc.nextInt();
		   
		   switch(option)
		   {
		   case 1: {
			   System.out.println("Enter Emp ID");
			   int empID = sc.nextInt();
			   System.out.println("Enter Name");
			   sc.nextLine();
			   String name = sc.nextLine();
			   System.out.println("Enter Salary");
			   float salary = sc.nextFloat();
			   
			   EmployeeBean emp = new EmployeeBean();
			   emp.setEmpId(empID);
			   emp.setName(name);
			   emp.setSalary(salary);
			  boolean status =  ac.insertEmpDetail(emp);
			   if(status)
			   {
				   System.out.println("Record successfully added");
			   }
			   else
			   {
				   System.out.println("Record already added");
			   }
			   break;
			   }
		   case 2: {
			   
			   break;
		   }
		   case 3: {
			   
			   System.out.println("Enter Employee ID");
			   int empID = sc.nextInt();
			   
			   EmployeeBean empl = ac.display(empID);
			   if(empl==null)
			   {
				   System.out.println("Employee not exist");
			   }
			   else
			   {
				   System.out.println(empl);
			   }
			   
			   break;
		   }
		   case 4: {
			   
			   break;
		   }
		   }
		   
		   
		   System.out.println("Do you want to continue");
		   
		   choice = sc.nextInt();
		   
	   }
	   while(choice==1);

	}

}
