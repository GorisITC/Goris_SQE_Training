public class ChangingSystem {
    public static void main(String[] args){
        int a[] = {1,1,1};
        int tasakan = 0;
        int j = a.length-1;
        int c = 0;
        int k = 1;
        for (int i = 0; i < j; i++) {
            j = (a.length - 1) - i;
            c = a[i];
            a[i] = a[j];
            a[j] = c;
        }
        for (int i = 0; i < a.length; i++) {
            tasakan+= a[i] * k;
            k*=2;
        }
        System.out.println(tasakan);

    }
}
