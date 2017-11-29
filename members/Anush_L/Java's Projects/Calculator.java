
public class Calculator {
	public static void main(String[] args) {
		float a = 10.7f;
		float b = 5.3f;
		System.out.println(addition(a, b));
		System.out.println(subtraction(a, b));
		System.out.println(multiplication(a, b));
		System.out.println(division(a, b));

	}
	public static float addition(float a, float b) {
		float sum = a + b;
		System.out.print(a + " + " + b + " = ");
		return sum;
	}
	public static float subtraction(float a, float b) {
		float sub = a - b;
		System.out.print(a + " - " + b + " = ");

		return sub;
	}
	public static float multiplication(float a, float b) {
		float mult = a * b;
		System.out.print(a + " * " + b + " = ");
		return mult;
	}
	public static float division(float a, float b) {
		float div = a / b;
		if (b == 0) {
            		System.out.print("Number can not be divided to ");
            		return b;
        	}
		System.out.print(a + " / " + b + " = ");
		return div;
	}
}
