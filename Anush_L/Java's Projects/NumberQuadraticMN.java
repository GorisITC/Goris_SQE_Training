
public class NumberQuadraticMN {
	public static void main(String[] args) {
		int n = -8;
		int m = 1;
		int i;
		int qd = 1;
		if (n < 0) {
			m = -1;
		}
		for (i = 2; i < n * m; i*=2) {
			qd++;
		}
		if (i == n * m && (m > 0 || (qd % 2) > 0)) {
			if (m > 0) {
				System.out.println(n + "֊ը 2-ի " + qd + " աստիճանն է։");
			} else {
				System.out.println(n + "֊ը -2-ի " + qd + " աստիճանն է։");
			}
		} else {
			System.out.println(n + "֊ը +/-2֊ի աստիճան չէ։");
		}
	}
}
