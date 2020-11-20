package mypack;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee employee= new Employee(4,"matt",4000,"new");
		Manager manager= new Manager(4,"jack",3444,"back",4);
		
		System.out.println(employee);
		System.out.println(manager);
		
	}

}
