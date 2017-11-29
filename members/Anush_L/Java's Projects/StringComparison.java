
public class StringComparison {
	public static void main(String[] args) {
		String a = "arev";
		String b = "arev";
		if (a.length() != b.length()) {
			System.out.println(false);		
		} else {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {
					System.out.println(false);
					break;
				} else if (i == a.length() - 1) {
					System.out.println(true);
				}
			}
		}
	}	
}
