public class Array_Equal{
    public static void main(String[] argss) {
        boolean b = false;
        int a[] = {6,2,10,9,6,4,2,0};
        int sum = 5;
        for (int i = 0; i < a.length ; i++) {
            for (int j = a.length-1; j > i; j--) {
                if (a[i] + a[j] == sum){
                    System.out.print(a[i]);
                    System.out.println(","+ a[j]);
		    b = true;
		    break;
                }
            }
        }
	if(!b)
        System.out.println("There are no numbers which sum is equal to  " + sum);
    }
}
