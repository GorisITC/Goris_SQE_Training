public class Main {
    public static void main(String args[]){
        int a=625;
        int i=1;

        while (i*i!=a) {
            i++;
            if (i * i > a) {
                System.out.println("Tivn armat chuni");
                System.exit(0);
            }
        }
        System.out.println(i);
    }
}
