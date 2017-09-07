
public class Polidrom {
	public static void main(String[] args) {
		String a = "Anna";
		char b[] = new char[a.length()];
		int c = b.length - 1;
		for (int i = 0; i < a.length(); i++) {
			b[c] = a.charAt(i);
			c--;
		}
		String d =  new String(b);
		if (a.equalsIgnoreCase(d)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
