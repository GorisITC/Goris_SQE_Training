public class Fibonachi {
    public static void main(String[] args){

        System.out.println("For the n Fibonacci number is  "+ fibonacci(0));
    }
    public static int fibonacci(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
            return fibonacci(n-1)+fibonacci(n-2);

    }
}
