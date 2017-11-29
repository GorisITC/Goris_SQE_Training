public class Shrjadarc {
   public static void main (String[] args){

       int [] a = {4,3,2,1};
       int b = 0;
       int c = 0;
       /*
       * 3 4 1 2
       * 3 1 4 2
       * 1 3 2 4
       * 1 2 3 4
       * */
       for (int j = 0; j < a.length; j++) {
            for (int i = b; i < a.length - 1; i+=2) {
                if (a[i] > a[i + 1]) {
                    c = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = c;

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
