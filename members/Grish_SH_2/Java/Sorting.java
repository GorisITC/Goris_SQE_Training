public class Sorting {
    public static void main(String[] argss){
        int a[] = {10,5,1,0,9,3};
         for(int i=0; i<=a.length;i++){
            for(int j=0; j<=a.length-2;j++){
                if(a[j]>a[j+1]){
                    int b=0;
                    b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                }
            }

        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k] + " ");
        }
    }
}

