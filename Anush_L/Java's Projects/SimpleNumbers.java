public class SimpleNumbers {
	public static void main(String[] args) {
		for (int i = 1; i <= 500; i++) {
			int d = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					d++;
					break;
				}
			}
			if (d < 1) {
				System.out.println(i);
			}
		}
	}
}
