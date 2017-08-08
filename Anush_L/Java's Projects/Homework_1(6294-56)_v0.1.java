class Homework_1_6294_56v01 {
    public static void main(String[] arg) {
        float t = 417;
        float a = (t - (t % 100)) / 100;
        float b = (t - (t % 10)) / 10 - a * 10;
        float c = (t % 10);
        float d = (a + b + c) / t;
        if (c > b) {
            System.out.println(d);
        } else {
            System.out.println(t);
        }
    }
}
