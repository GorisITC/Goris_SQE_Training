
public class SumWithN {
	public static void main(String[] args) {
		int n = 10;
		int a = 3;
		int b = 5;;
		int sum = 0;
		int i = 1;
		while (a * i < n || b * i < n) {
			if (a * i < n) {
				sum+= a * i;
			}
			if (b * i < n) {
				sum+= b * i;;
			}
			i+=1;
		}
		System.out.println(a + "֊ին և/կամ " + b + "֊ին բազմապատիկ բոլոր " + n + "֊ից փոքր թվերի գումարը ― " + sum);
	}

}
