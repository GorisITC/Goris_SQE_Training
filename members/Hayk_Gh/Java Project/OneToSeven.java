public class OneToSeven {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            for(int k = 7;k>=i;k--){
                if(i == 1){
                    continue;
                }
                System.out.print('*');
            }
            System.out.println();
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
        }
    }
}











