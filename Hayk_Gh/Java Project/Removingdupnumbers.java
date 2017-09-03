public class Removingdupnumbers {


    public static void main(String[] args) {

        int[] a = {1,3,5,2000,5,1,5,5,5,5,5,5};
        int i;
        int j;

        System.out.println("Here are remaining values of an array");

        for (i = 0; i < a.length; i++) {
            boolean d = true;
            for (j = 0; j < a.length; j++) {
                if (a[i] == a[j] && j != i) {
                    d = false;
                }

            }
            if (d) {
                System.out.println(a[i]);
            }
        }
    }
}

