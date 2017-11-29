
public class EvenOdd {
	public static void main(String[] args) {
		int n = -14;
		boolean a = (n%2) > 0 || (n%2) < 0;
		System.out.println(a);
		if (a == true) {
			System.out.println("Your number is odd.");
		} else {
			System.out.println("Your number is not odd. It is even.");
		}
	}
}
