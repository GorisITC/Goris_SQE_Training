public class Eranish {
	public static void main(String... args) {
	int abc = 969;
	int a = (abc / 100);
	int b = ((abc / 10) % 10);
	int c = (abc % 10);
	float d = (a+b+c);
	if (c>b) {
		System.out.println(d/abc);
	}
		else {
			System.out.println(abc);
		}

}
  }
