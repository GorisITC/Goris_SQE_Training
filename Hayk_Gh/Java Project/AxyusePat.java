public class AxyusePat {
    public static void main(String[] args) {
        System.out.println(Fibo(7));
    }

    public static int Fibo(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return Fibo(n-1) + Fibo(n-2);
    }

}
