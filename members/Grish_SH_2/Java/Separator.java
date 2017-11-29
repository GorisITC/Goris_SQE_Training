public class Separator {
    public static void main(String[] argss){
        int n = 46;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i%3 == 0 && i%5 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
