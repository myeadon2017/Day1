package mypack;

public class Manager extends Employee {

	private int managerId;


	public Manager(int empId, String empName, int income, String department, int managerId) {
		super(empId, empName, income, department);
		this.managerId = managerId;
	}


	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + "]";
	}
	
	
}
