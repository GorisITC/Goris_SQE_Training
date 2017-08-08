class Homework_1_6294_60v01 {
    public static void main (String[] args) {
        int t = 268;
        int a = t / 100;
        int b = t / 10 - a * 10;
        int c = t - a * 100 - b * 10;
        if (a < b && b < c) {
            System.out.println(c+", "+b+", "+a);
        } else {
            if (a < c && b > c) {
                System.out.println(b+", "+c+", "+a);
            } else {
                if (a > c && b < c) {
                    System.out.println(a+", "+c+", "+b);
                } else {
                    if (a < c && b < a) {
                        System.out.println(c+", "+a+", "+b);
                    } else {
                        if (a > b && b > c) {
                            System.out.println(a+", "+b+", "+c);
                        } else {
                            System.out.println(b+", "+a+", "+c);
                        }
                    }
                }
            }
        }
    }
}
