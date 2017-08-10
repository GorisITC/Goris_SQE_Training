class FactorialN {
    public static void main(String[] args) {
        int a = 1;
        int n = 4;
        int b = 1;
        while (b < n) {
            b = b + 1;
            a = a * b;
        }
        System.out.println(a);
    }
}
