public class Letters {
    public static void main(String[] argss){
        String a = "gRISH sHALUNTS";
        char c [] = new char [a.length()];
        for (int i = 0; i < a.length(); i++) {
            int b =a.charAt(i);
            if (b >= 65 && b <=90){
                b+=32;
            }
            else if(b >= 97 && b <= 122){
                b-=32;
            }
            c[i] = (char)b;
       }
       a = new String(c);
        System.out.println(a);
    }
}
