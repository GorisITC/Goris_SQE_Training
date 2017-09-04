//looks good
public class ElementsSum {
	public static void main(String[] args) {
		int n = 15;
		int a[] = {14, 1, 7, 8, 3, 10, 2, 6, 9, 0, 2, 15, 8};
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j > i; j --) {
				if (a[i] + a[j] == n) {
					System.out.println(a[i] + " (element " + i + ")"+ " and " + a[j] + " (element " + j + ")"+ " sum is " + n);
				}
			}
		}
	}
}
