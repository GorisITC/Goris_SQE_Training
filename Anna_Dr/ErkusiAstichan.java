
public class ErkusiAstichan {
	public static void main(String[] args) {	
		int n = 9;
		int ast = 0;
		int i;
		for (i = 1; i < n; i*=2) {
			ast++;
		}
		if (i==n) {
			System.out.println(ast);
		} else {
			System.out.println(n + "-ը" + " 2֊ի աստիճան չէ");
		}
	}
}

