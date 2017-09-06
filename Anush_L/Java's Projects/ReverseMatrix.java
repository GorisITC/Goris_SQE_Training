public class ReverseMatrix {
    public static void main(String[] args) {
        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
    	System.out.println("Matrix");
    	for (int  i = 0; i  < a.length; i++) {
    		for (int j = 0; j < a[i].length; j++) {
    			 System.out.print(a[i][j] + " ");
    		}
            System.out.println("");

    	}
    	System.out.println("");
    	System.out.println("Reversed Matrix");
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
