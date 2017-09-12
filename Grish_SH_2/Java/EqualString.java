public class EqualString {
    public static void main(String[] args) {
        String a = "duza";
        String b = "duza";
        if (a.length() != b.length()) {
            System.out.println("false");
            return;
        }
        boolean c = true;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                c = false;
            }
        }
        System.out.println(c);
    }
}
