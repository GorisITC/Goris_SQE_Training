
public class Palindrome {
	 public static void main(String[] args) {
		 String a = "asa";
		 StringBuilder b = new StringBuilder(a);
		 b.reverse();
		 String c = b.toString();
		 System.out.println(a.equals(c));
	 }
}
