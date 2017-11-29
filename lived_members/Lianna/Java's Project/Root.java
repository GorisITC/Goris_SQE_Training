public class Root {
    public static void main(String[] args) {
        int n=3;
        int x;
        for (x=1; x<=n; x++) {
            if (n == x * x) {
                System.out.println(x);
                break;
            }
        }
        if (n!=x*x) {
            System.out.println("Տրված թիվը արմատ չունի");
        }
    }
}
