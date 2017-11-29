
public class PolidromV {
	public static void main(String[] args) {
		String a = "Anna";
		StringBuilder b = new StringBuilder(a);
		b.reverse();
		String c = b.toString();
		System.out.println(a.equalsIgnoreCase(c));
	}

}
