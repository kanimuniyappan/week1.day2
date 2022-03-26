package week1.day2;

public class Calculator {
	
	public int add(int num1, int num2) {
		return num1+num2;
		
	}
	public double sub(double number1, double num2) {
		return number1-num2;
		
	}
	
	public double mul(double num1, double num2) {
		return num1*num2;
		
	}
	
	public double div(double num1, double num2) {
		return num1/num2;
		
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(3, 4));
		System.out.println(cal.sub(1.2, 1.4));
		System.out.println(cal.mul(3.2, 4.3));
		System.out.println(cal.div(3.2, 4.3));

}
}
