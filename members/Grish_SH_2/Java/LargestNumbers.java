public class LargestNumbers {
    public static void main (String[] argss){
    int a []  = {111,1,5,56,99,16,1};
    if (a.length <= 1){
        System.out.println("Error");
        System.exit(-1);
    }
    int b = 0;
    int d = 1;
        for (int i = 0; i < a.length ; i++) {
           if (i != a.length-1 && a[i] + a[i+1] > a[b] + a[d]) {
               b = i;
               d = i + 1;
            }
        }
        System.out.println(b + " " + d);

    }
}
