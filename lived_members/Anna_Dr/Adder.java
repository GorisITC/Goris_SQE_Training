import java.lang.Math;

public class Adder {

    public static double determinant(int a, int b, int c) { ;
  //      return double x1 = (( -b + Math.sqrt ( b ) )/( 4*a*c ));
         double x2 = ( -b - Math.sqrt ( b ) )/( 4*a*c );
         return x2
               }

    public static double determinant(int a, int b) {
    //    return double x1 = (( -b + Math.sqrt ( b ) )/( 4*a));
         double x2= ( -b - Math.sqrt ( b ) )/( 4*a );
         return x2;
    }

        public static void main(String[] args){
            System.out.println(determinant (2,3 ));
            System.out.println(determinant (2,3,-8));
        }


}
