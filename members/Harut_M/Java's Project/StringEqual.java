public class StringEqual {
    public static void main(String[] args) {
        String a = "string test";
        String b = "string test";

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                char d = b.charAt(i);
                if ( c!=d ) {
                    System.out.println(false);
                    break;
                }else if (i == a.length()-1){
                    System.out.println(true);
                }
            }

            } else {
                System.out.println(false);
            }


        }


}