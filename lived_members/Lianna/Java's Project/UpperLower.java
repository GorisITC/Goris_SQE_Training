
public class UpperLower {
	 public static void main(String[] args) {
		 String a = "dOnT WoRrY bE HaPPy";
		 char [] b = new char[a.length()]; 
		 for(int i = 0; i < a.length(); i++) {
			 int n = a.charAt(i);
			 if(n >= 65 && n <= 90) {
				 n+=32;
				 } else if(n >= 97 && n <= 122) {
					 n -= 32;
					 }
			 b[i] = (char)n;
			 }
		 a = new String(b);
		 System.out.println(a);
	 }

}
