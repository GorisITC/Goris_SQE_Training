
public class Main {
	public static void main(String[] args) {		
		try {
			Stack a = new Stack(3);
			a.push("First");
			System.out.println(a.peek());
			System.out.println(a.isFull());
			a.push("Second");
			System.out.println(a.peek());
			System.out.println(a.isEmpty());
			a.push("Third");
			System.out.println(a.isFull());
			a.push("Fourth");
			System.out.println(a.pop());
			System.out.println(a.peek());
			System.out.println(a.pop());
			System.out.println(a.pop());
			System.out.println(a.pop());
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
