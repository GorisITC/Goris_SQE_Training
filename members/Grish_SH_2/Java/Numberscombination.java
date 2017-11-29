public class Numberscombination {
    public static void main(String[] argss){
        int length = 7;
        int i = 0;
        for (int a = 1; a < length ; a++) {
            for (i = 1; i <= a;i++) {
                System.out.print(i);
            }
            for (int j = length; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
