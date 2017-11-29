
public class RecursionFibonacci {
	public static void main(String[] args) {
		int n = 8;
		if (n < 0) {
			System.out.println(n + " is smaller than 0");
		} else {
			System.out.println("The " + n + "-th number of Fibonacci is " + fibonacci(n) + ".");
		}
	}
	public static int fibonacci(int n) {
		return n == 1 || n == 0 ? n : fibonacci(n-1) + fibonacci(n-2);
	}
}
