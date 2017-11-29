// Please write comments what should do the code
// Use more understandable property names
// Class name should be a noun
public class DuplicateNumbersRemoving {
	public static void main(String[] args) {
		int a[] = {1, 4, 5, 6, 1, 1, 8, 8, 8, 5, 7, 0};
		//Where do you use n?
                int n = a.length;
                //Array will has more size then need. Pls correct
                // please resolve the problem using only one array
		int[] b = new int[n];
		int k = 0;
		System.out.print("Here is non duplicated numbers of Array: ");
		for (int i = 0; i < a.length; i ++) {
			for (int j = a.length - 1; j > i; j--) {
				//The logic is not correct e.g for 0. Also, it is very hard, pls resolve the problem in more easy way  
                                if (a[i] == a[j]) {
					k = i;
					b[k] = a[i];
					a[j] = 0;
				}
	
			}
			for (int l = 0; l < b.length; l++) {
				if (b[k] == a[i]) {
                                        //What should happen if you have 0 in the array?
					a[i] = 0;
				}
			}
			if (a[i] != 0) {
                                //"," will print in the end of the array as well which is not correct. Also, pls investigate the mechanisms to print array. 
				System.out.print(a[i] + ", ");
			}
		}
	}
}
