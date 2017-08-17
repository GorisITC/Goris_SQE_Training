public class Fact {
    public static void main(String[] argss) {
       try{
       System.out.println(fac(-5));
       }catch(ArithmeticException e){
       e.printStackTrace();
       }

       System.out.println("Tesar");
    }
    public static int fac(int n) {
        if (n < 0){
	    throw new ArithmeticException("The number is not matched");
	}
        int factorial = 0;
        if (n == 0) {
            factorial = 1;
        } else {
            factorial = n * fac(n - 1);
        }
        return factorial;
    }
}
