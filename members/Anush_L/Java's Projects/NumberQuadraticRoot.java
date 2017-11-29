
public class NumberQuadraticRoot {
	public static void main(String[] args) {
		int n = 25;
		if (n <= 0) {
			System.out.println("Տրված թիվը քառակուսային արմատ չունի:");
		} else {
			for (int i = 2; i < n; i++) {
				if (n == i * i) {
					System.out.println(n + "֊ի քառակուսային արմատը " + i + " կամ " + (-i) +"֊ն է։");
					break;
				} else if (n < i * i) {
					System.out.println("Տրված թիվը քառակուսային արմատ չունի:");
					break;
				}
			}
		}
	}
}
 