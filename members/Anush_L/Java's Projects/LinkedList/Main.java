
public class Main {
	
	public static void main(String[] args) {
		
		LinkedList<String> test = new LinkedList<>();
		test.add("first");
		test.add("second");
		test.add("third");
		test.add("forth");
		try {
			test.remove(1);
			test.remove("tird");
			for (int j = 0; j < test.size(); j++) {
				System.out.println(test.get(j));

			}
			System.out.println(test.indexOf("first"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(test.getFirst());
		System.out.println(test.getLast());
		System.out.println(test.size());
		
	}
	
}
