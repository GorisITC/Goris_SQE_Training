public class Dividing {
    public static void main(String[] argss){
        boolean a;
        int b = 500;
        for(int i= 1;i <= b;i++) {
            a = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }

            }
            if (a){
                System.out.println(i);
            }
        }
    }
}

