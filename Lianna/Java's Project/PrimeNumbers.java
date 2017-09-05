package second;

public class PrimeNumbers {
	public static void main(String[] args) {
		for (int i=1; i<=500; i++) {
			boolean n = false;
			for (int a=2; a<i; a++) {
				if (i%a == 0) {
				n = true;
				break;
				}
			}
			if (n == false) {
				System.out.println(i);
			}
		}
	}
}
