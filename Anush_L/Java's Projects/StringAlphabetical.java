public class StringAlphabetical {
	public static void main(String[] args) {
		String a[] = {"Arev", "aram", "Bare", "barev", "aghues", "bare", "arev"};
		int b = 0;
		int ln = a[0].length();
		for (int i = 0; i < a.length; i++) {
			for (int j = b; j < a.length - 1; j+= 2){
				if (a[j].length() > a[j+1].length()) {
					ln = a[j+1].length();
					String e = a[j+1];
					a[j+1] = a[j];
					a[j] = e;
				}
				for (int k = ln - 1; k >= 0; k--) {
					char c = a[j].charAt(k);
					char d = a[j+1].charAt(k);
					if (c > d && c - 32 != d) {
						if (c >= 97 && c <= 122 &&  d >= 65 && d <= 90) {
							if (c - 32 > d) {
								String e = a[j+1];
								a[j+1] = a[j];
								a[j] = e;
							}
						} else {
							String e = a[j+1];
							a[j+1] = a[j];
							a[j] = e;
						}
					} else if (d >= 97 && d <= 122 &&  c >= 65 && c <= 90) {
						if (c + 32 > d) {
							String e = a[j+1];
							a[j+1] = a[j];
							a[j] = e;
						}
					}
				}
			}
			if (b == 0) {
				b = 1;
			} else {
				b = 0;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
