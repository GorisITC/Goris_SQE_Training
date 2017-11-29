
public class UpperLowerCaseConvertion {
	public static void main(String[] args) {
		String a = "bU, bOOO, aHA, hA hA hA :)";
//		For more complex modification
		StringBuilder b = new StringBuilder(a);
		System.out.println("Given String: ");
		System.out.println(b);
		System.out.println("");
//		To get each character from given String
		for (int i = 0; i < a.length(); i++) {
			char ch = b.charAt(i);
//		To convert lower case to upper and upper to lower	
			if (Character.isLowerCase(ch)) {
				b.setCharAt(i, Character.toUpperCase(ch));
			} else if (Character.isUpperCase(ch)) {
				b.setCharAt(i, Character.toLowerCase(ch));
			}
		}
		System.out.println("Given String after convertion: ");
		System.out.println(b);
	}
}
