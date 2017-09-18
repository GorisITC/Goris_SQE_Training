
public class SymbolsCombinations {
	public static void main(String[] args) {
		String a = "abcd";
		System.out.println("The combinations for chars of a String: ");
		combinations(a, "");
		System.out.println("A number of chars' combinations for a String with " + a.length() + " length: " + combinationscount(a, a.length()));
	}
	public static int combinationscount(String a, int count) {
		return count == 1 ? count : count * combinationscount(a, count - 1);
	}
	private static void combinations(String a, String empty) {
		if (a.length() == 0) {
			System.out.println(empty);
		}
		else {
			for (int i = 0; i < a.length(); i++) {
				combinations(a.substring(0,i) + a.substring(i+1, a.length()), empty + a.charAt(i));
			}
		}
	}
}