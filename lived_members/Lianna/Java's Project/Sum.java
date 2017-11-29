
public class Sum {
	public static void main(String[] args) {
		int a[] = {3,5,8,4,2,7,6,8};
		int b = 13;
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length -1; j > i; j --) {
				if (b == a[i] + a[j]) {
				System.out.println(a[i] + " " + a[j]);
				}
			}
		}
	}
}
