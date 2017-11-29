package com.company;

public class SameNumbers {

    public static void main(String[] args) {

        int a[] ={10,22,10,16,5,4};
        int b =0;


        for (int i = 0; i < a.length;i++){
            boolean f = true;
            for (int j=0;j<a.length; j++){

                if (a[i]==a[j] && i !=j){
                    f = false;


                }

                                    }

                                    if (f) {
                                        System.out.println(a[i]);
                                    }





            }







        }




    }

