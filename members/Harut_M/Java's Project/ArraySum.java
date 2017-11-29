package com.company;

public class ArraySum {

    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        int index[] = new int[5];
        int j = 0;

        for (int i =0; i<a.length;i++){


            for (int b =0;b<a.length;b++ ){
                boolean t = true;
                for (int k = 0; k <=j ; k++) {
                    if (index[k] == a[i] || index[k] == a[b]) {
                       t = false;
                    }
                }

                if (a[i]+a[b]==5&& i!=b && t){
                    System.out.println(a[i] + " + " + a[b] + " = 5" );
                    index[j] = a[i];
                    j++;
                    index[j] = a[b];
                    j++;
                }



            }




            }




        }




    }

