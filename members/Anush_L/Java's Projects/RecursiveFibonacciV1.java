public class RecursiveFibonacciV1 {
    
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
//Review: Please also add support for printing fibonachi secuence, like 0 1 1 2 3 5 8 13 21 34 
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else 
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
