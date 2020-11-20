package mypack;

public class Employee {
	
	private int empId;
	private String empName;
	private int income;
	private String department;
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName, int income, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.income = income;
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", income=" + income + ", department=" + department
				+ "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
	


