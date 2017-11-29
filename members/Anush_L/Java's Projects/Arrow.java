
public class Arrow {
	public static void main(String[] args) {
		String a = ">>>-->>><<---<<<<<---<<<---<<----->--->>->";
		int count = 0;
		for (int i = 0; i < a.length() - 2; i++) {
			if (a.charAt(i) == a.charAt(i+1) && a.charAt(i) != '-') {
				if (a.charAt(i+2) == '-') {
					for (int j = i + 3; j < a.length(); j++) {
						if (a.charAt(j) != a.charAt(i) && a.charAt(j) != a.charAt(i+2)) {
							break;
						}
						if (a.charAt(j) == a.charAt(i)) {
							count++;
							break;
						}
					}
				}
			}
		}
		System.out.println("The number of arrows in a given String: " + count);
	}
}