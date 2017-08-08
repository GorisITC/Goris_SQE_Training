class Homework_1_6294_51v01 {
    public static void main(String[] args) {
        int t = 268;
        int a = t / 100;
        int b = t / 10 - a * 10;
        int c = t - a * 100 - b * 10;
        if (c == a + b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(t);
    }
}
