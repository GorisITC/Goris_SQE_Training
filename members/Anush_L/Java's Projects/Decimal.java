
public class Decimal {
	public static void main(String[] args) {
		int a = 2;
		int[] b = new int[a];
		for (int i = b.length - 1; i >= 0; i--) {
			if (a % 2 == 0) {
				b[i] = 0;
			} else {
				b[i] = 1;
			}
			if (a == 1) {
				b[i] = 1;
				break;
			}
			a/= 2;
		}
		for (int j = 0; j < b.length; j++) {
			if (b[j] == 1) {
				for (int l = j; l < b.length; l++) {
					System.out.print(" " + b[l]);
				}
				break;
			}
		}
	}
}
