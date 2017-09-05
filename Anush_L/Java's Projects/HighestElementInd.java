
public class HighestElementInd {
	public static void main(String[] args) {
		int[][] a = {{15,32,10,2}, {10,1,35,1}, {25,36,47}, {45,78,10,115}};
		//sum is the highest sum of the elements in one line
		int sum= 0;
		// ind keep the elements line
		int ind = 0;
		//inda a keep the first element of the highest sum
		int inda = 0;
		//indb keep the second element of the highest sum
		int indb = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				if (a[i][j] + a[i][j + 1] > sum) {
					sum = a[i][j] + a[i][j + 1];
					ind = i;
					inda = j;
					indb = j + 1;
				}
			}
		}
		System.out.println("The element indexes of the highest sum: Line " + ind + " _ Elements " + inda + ", " + indb);
	}
}
