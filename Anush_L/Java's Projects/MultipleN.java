
public class MultipleN {
	public static void main(String[] args) {
		int n = 10;
		int a = 3;
		int b = 5;
		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (a * i < n && b * i < n) {
				sum+= (a + b) * i;
			} else {
				break;
			}
		}
		System.out.println(sum);
	}
}
