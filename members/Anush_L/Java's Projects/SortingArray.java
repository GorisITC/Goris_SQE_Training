
public class SortingArray {
	public static void main(String[] args) {
		int a[] = {10, 5, 3, 4, 5, 1, 2, 9};
		int b = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j >= i; j--) {
				if (a[i] > a[j]) {
					b = a[j];
					a[j] = a[i];
					a[i] = b;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
