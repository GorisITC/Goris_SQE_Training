import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionsCalculator {
	public static void main(String[] args) {
		boolean n = true;
		float a = 0;
		float b = 0;
		while (n == true) {
			try {
				Scanner sca = new Scanner(System.in);
				System.out.println("Please enter a first number: ");
				a = sca.nextFloat();
				n = range(a);
			} catch (InputMismatchException e) {
				System.out.println("You should enter a number.");
			} 
		}
		n = true;
		while (n == true) {
			try {
				Scanner scb = new Scanner(System.in);
				System.out.println("Please enter a second number: ");
				b = scb.nextFloat();
				n = range(b);
			} catch (InputMismatchException e) {
				System.out.println("You should enter a number.");
			} 
		}
		try {
			addition(a, b);
		} catch (ArithmeticException e) {
            System.out.println(e.getMessage());
		} finally {
			try {
				subtraction(a, b);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					multiplication(a, b);
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
				} finally {
					try {
						division(a, b);
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());
					}
				}
			}	
		}
	}
	public static float addition(float a, float b) {
		float sum = a + b;
		resultrange(sum, "addition");
		if (true) {
			System.out.println(a + " + " + b + " = " + sum);
		}
		return sum;
	}
	public static float subtraction(float a, float b) {
		float sub = a - b;
		resultrange(sub, "subtraction");
		if (true) {
			System.out.println(a + " - " + b + " = " + sub);
		}
		return sub;
	}
	public static float multiplication(float a, float b) {
		float mult = a * b;
		resultrange(mult, "multiplication");
		if (true) {
			System.out.println(a + " * " + b + " = " + mult);
		}
		return mult;
	}
	public static float division(float a, float b) {
		float div = a / b;
		if (b == 0) {
			throw new ArithmeticException  ("Number can not be divided to 0.");
		}
		resultrange(div, "division");
		if (true) {
			System.out.println(a + " / " + b + " = " + div);
		}
		return div;
	}
	public static boolean range (float a) {
		if (a > Float.MAX_VALUE || a < -(Float.MAX_VALUE)) {
			System.out.println("My dear user, you should enter a shorter number.");
		}
		return a > Float.MAX_VALUE || a < -(Float.MAX_VALUE);
	}
	public static boolean resultrange (float result, String calculation) {
		if (result > Float.MAX_VALUE || result < -(Float.MAX_VALUE)) {
			throw new ArithmeticException  ("Unfortunately your result of " + calculation + " is out of range.");
		}
		return false;
	}
}
