public class Alphabetical {

    public static void main(String[] args) {

        String[] a = {"Hab","Had","Haa","Haz"};

       for (int i = 0;i<a.length;i++) {
           for (int j = a.length - 1; j > 0; j--) {

               if (a[i].compareTo(a[j]) > 0) {
                   String c = a[j];
                   a[j] = a[i];
                   a[i] = c;
               }
           }
           for (i = 0; i <=a.length - 1; i++) {
               System.out.println(a[i]);

           }
        }
    }
}








