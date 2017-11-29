
public class EvenNumbersDiagonal {
	public static void main(String[] args) {
		//n is a quantity of even numbers of diagonal
		int n = 0;
		int[][] a = {{6,2,3,1}, {4,8,6,2}, {7,10,9,4}, {10,23,5,7}};
		System.out.println("The even numbers of diagonal:");
		for (int i = 0; i < a.length; i++) {
			if (a[i][i] % 2 == 0) {
				n+= 1;
				System.out.println(a[i][i]);
			}
		}
		System.out.println("The quantity of the even numbers of diaganal: " + n);
	}
}
