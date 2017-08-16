public class Factorial2{
    public static void main(String[] args){
    System.out.println(factorial(4));
    }
    public static long factorial(int n){
    long factorial = 1;
    for (int i=n; i>0; i=i--){
	factorial = factorial * i--;
    }
    return factorial;    
    }
}
