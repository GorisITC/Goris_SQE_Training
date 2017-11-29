class ThreeDigitNumberMult {
    public static void main(String[] args) {
        float n = 100;
        float a = 1;
        while (n < 1000) {
            if ((n % 2) > 0 || (n % 3) > 0) {
                continue;
            } else {
                a = a * n;
            }
            n = n + 1;
        }
        long b = (long)Math.round(a);
        System.out.println(b);
    }
}
