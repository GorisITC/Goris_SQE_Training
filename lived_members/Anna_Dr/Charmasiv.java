public class Charmasiv {
	
	public static void main(String[] args) {
	
		String a = "MeCaTar, pOqRaTar";
		char [] b = new char[a.length()];
		
		for(int i = 0; i < a.length(); i++) {
			int v = a.charAt(i);
			
			if(v >= 65 && v <=90) {
				v+=32;
			} else if(v >=97 && v<= 122) {
				v-=32;
			}
			
			b[i] = (char)v;
		}
		a = new String(b);
		System.out.println(a);

	}

}
