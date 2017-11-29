public class Fibonachi {

        public static void main (String[] args){
            System.out.println(tver(5));
        }
        public static int tver(int n){

            if(n == 0 || n == 1){

                return 1;

            }else {

                return tver(n-1) + tver(n-2);
            }
        }
 }







