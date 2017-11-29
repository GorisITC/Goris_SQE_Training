
public class RecursionNumber {
	public static void main(String[] args) {
		int n = 2873;
		numberreversion(n);
	}
	public static int numberreversion(int n) {
		if (n <= -10) {
			System.out.print("-");
			n*= -1;
		}
	    System.out.print(n % 10);
		return n < 10 && n > -10 ? n: numberreversion(n / 10);
	}
}
