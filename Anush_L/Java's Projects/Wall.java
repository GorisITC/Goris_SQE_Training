
public class Wall {
	public static void main(String[] args) {
		int n = 3;
		n++;
		if (n < 0) {
			System.out.println(n + " is smaller than 0");
		} else {
			System.out.println("The variations of walls with " + n + " blocks will be " + fibonacci(n) + ".");
		}
	}
	public static int fibonacci(int n) {
		return n == 1 || n == 0 ? n : fibonacci(n-1) + fibonacci(n-2);
	}
}
