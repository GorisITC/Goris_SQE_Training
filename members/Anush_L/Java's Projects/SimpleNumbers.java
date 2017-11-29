public class SimpleNumbers {
	public static void main(String[] args) {
		for (int i = 1; i <= 500; i++) {
			boolean d = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					d = true;
					break;
				}
			}
			if (d == false) {
				System.out.println(i);
			}
		}
	}
}
