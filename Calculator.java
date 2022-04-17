package week1.day2;

public class Calculator {
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Calculator1");
		System.out.println("----------");
		int addThreeNum = obj.addThreeNum(5, -2, 5);
		System.out.println(addThreeNum);
		int subTwoNum = obj.subTwoNum(6, 5);
		System.out.println(subTwoNum);
		double multiplyTwoNumbers = obj.multiplyTwoNumbers(12.224567, 11.334541);
		System.out.println(multiplyTwoNumbers);
		float divideTwoNumbers = obj.divideTwoNumbers(8.4f, 2.2f);
		System.out.println(divideTwoNumbers);
	}
	public void Calcuator() {
		System.out.println("Calculator");
}
public int addThreeNum(int a, int b, int c) {
	int sum = a+b+c;	
	return sum; 
}
public int subTwoNum(int c, int d) {
	int sub = c-d;	
	return sub; 
}
public double multiplyTwoNumbers(double e, double f) {
	double multiply = e*f;
	return multiply;
}
public float divideTwoNumbers(float g, float h) {
	float divide = g/h;
	return divide;
}
}