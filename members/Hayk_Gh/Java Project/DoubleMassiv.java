public class DoubleMassiv {

    public static void main (String[] args){

        int [][] a = {{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};

        /*
        *    0 1 2 3
        *    4 5 6 7
        *    8 9 10 11
        *    12 13 14 15
        * */

        int b = 0;
        for(int i = 0;i<a.length;i++){

           if (a[i][i]%2 == 0){
              b++;
           }
        }
         System.out.println(b);
    }
}
















