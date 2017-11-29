
public class Ankyunagic {

	public static void main(String[] args) {
		int c;
		
		int a [] = {0,1,1,0,0,1};
		int b = a.length-1;
		for (int i = 0; i < a.length/2; i++) {
			c= a[i];
			a[i] = a[b];
			a[b]=c;
			b--;
			}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}				
	}
}



