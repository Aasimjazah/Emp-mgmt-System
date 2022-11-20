package BeanClasses;

public class EmployeeBean 
{
	private int empId;
	private String name;
	private float salary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String toString()
	{
		 return "EMpID is "+empId+" name is"+name+" Salary is "+salary;
	}

}
