public class ChangingSystemSecond {
    public static void main(String[] args){
        int a = 455;
        for (int i = 1; i <= a; a/=2) {
            if(a % 2 == 0){
                System.out.print(0 + " ");
            }else {
                System.out.print(1 + " ");
            }
        }
    }
}
