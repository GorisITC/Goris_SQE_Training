// looks good

public class Sumvalues {
    public static void main (String[] args) {

        int[] a = {1, 3, 5, 10,0, 4,};
        int n = 4;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++){

                if (a[i] + a[j] == n){

                    System.out.println(a[i] + " + " + a[j] + " = " + n);


                }

            }

        }


    }
}
