class DFactorialN {
    public static void main(String[] args) {
        float n = 10;
        float a = n;
        if ((n % 2) > 0) {
            while (n > 1) {
                n = n - 2;
                a = a * n;
            }
        } else {
            while (n > 2) {
                n = n - 2;
                a = a * n;
            }
        }
        System.out.println(a);
    }
}
