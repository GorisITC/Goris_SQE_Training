
public class DuplicateNumbersRemoving {
	public static void main(String[] args) {
		int a[] = {1, 4, 5, 6, 1, 1, 8, 8, 8, 5, 7, 9};
		int n = a.length;
		int[] b = new int[n];
		int k = 0;
		System.out.print("Here is non duplicated numbers of Array: ");
		for (int i = 0; i < a.length; i ++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[i] == a[j]) {
					k = i;
					b[k] = a[i];
					a[j] = 0;
				}
	
			}
			for (int l = 0; l < b.length; l++) {
				if (b[k] == a[i]) {
					a[i] = 0;
				}
			}
			if (a[i] != 0) {
				System.out.print(a[i] + ", ");
			}
		}
	}
}
