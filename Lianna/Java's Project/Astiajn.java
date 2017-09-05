package first;

public class Astiajn {
	 public static void main(String[] args) {
	        int n = 9;
	        int a;
	        int k = 1;
	        for (a = 2; a < n; a *= 2) {
	            k++;
	        }
	       if (a == n) {
	           System.out.println(k);
	       } else {
	           System.out.println(n + " chuni");
	       }
	    }
}
