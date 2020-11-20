package mypack;

public class StaticDemo {
	
	
	static int a=3;
	static int b;
	
	
	
	static void calculate(int x) {
		System.out.println("x " +x);
		System.out.println("a " +a);
		System.out.println("b " +b);
	}
	
	static {
		System.out.println("static block init");
		b=a*4;
	}
	public static void main(String[] args) {
		calculate(22);
	}

}
