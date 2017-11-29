
public class NumberQuadraticRootV {
	public static void main(String[] args) {
		int n = 16;
		if (n <= 0) {
			System.out.println("Տրված թիվը քառակուսային արմատ չունի:");
		} else if (n == 1) {
			System.out.println("1֊ի քառակուսային արմատը 1-ն է։");
		} else {
			for (int i = 2; i < n; i++) {
				if (n == i * i) {
					System.out.println(n + "֊ի քառակուսային արմատը " + i + "֊ը կամ " + (-i) +"֊ն է։");
					break;
				} else if (n < i * i) {
					System.out.println("Տրված թիվը քառակուսային արմատ չունի:");
					break;
				}
			}
		}
	}
}
 
