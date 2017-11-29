class Homework_1_6294_54v01 {
    public static void main (String[] args) {
        int t = 456;
        int a = t / 100;
        int b = t / 10 - a * 10;
        int c = t - a * 100 - b * 10;
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
