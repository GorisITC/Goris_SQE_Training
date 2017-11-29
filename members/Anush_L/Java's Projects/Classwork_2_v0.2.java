class FactorialNWithDoWhile {
    public static void main(String[] args) {
        int a = 1;
        int n = 4;
        int b = 1;
        do {
            b = b + 1;
            a = a * b;
        } while (b < n);
        System.out.println(a);
    }
}
