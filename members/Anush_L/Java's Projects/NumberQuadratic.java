public class NumberQuadratic {
	public static void main(String[] args) {
		int n = 1;
		int i;
		int qd = 1; 
		if (n == 1) {
			System.out.println(n + "֊ը 2-ի 0 աստիճանն է։");
		} else {
			for (i = 2; i < n; i*=2) {
				qd++;
			}
			if (i == n) {
				System.out.println(n + "֊ը 2-ի " + qd + " աստիճանն է։");
			} else {
				System.out.println(n + "֊ը 2֊ի աստիճան չէ։");
			}
		}
	}
}
