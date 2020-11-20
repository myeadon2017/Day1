package mypack;

public class Student {
	
	private String stuName;
	private int stuGrade;
	private String stuCity;
	public Student() {
		System.out.println("its called but");
		
	}
	
	public Student(String stuName, int stuGrade, String stuCity) {
		super();
		this.stuName = stuName;
		this.stuGrade = stuGrade;
		this.stuCity = stuCity;
	}
	
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuGrade=" + stuGrade + ", stuCity=" + stuCity + "]";
	}
	
	

}
