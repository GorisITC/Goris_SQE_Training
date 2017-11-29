
public class SortingArrayV {
	public static void main(String[] args) {
		int a[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int b = a[0];
		int k = 0; 
		for(int j = 0; j < a.length; j++) {
			for (int i = k; i < a.length-1; i+=2) {
				if(a[i] > a[i+1]) {
					b = a[i+1];
					a[i+1] = a[i];
					a[i] = b;
				}
			}
			if(k == 1) {
				k=0;
			} else {
				k=1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
