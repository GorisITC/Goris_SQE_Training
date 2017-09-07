
public class SubString {
	public static void main(String[] args) {
		String a = "Hello Hi Hi Hi Hi Hello Hey";
		String subs = "Hi";
		int b = a.split(subs).length - 1;
		System.out.println("The number of '" +subs + "' in '" + a + "': " + b);
	}
}
