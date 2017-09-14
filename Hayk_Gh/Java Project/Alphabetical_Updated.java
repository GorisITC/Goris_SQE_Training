package com.company;

public class Main {
    public static void main(String[] args) {

        String[] a = {"Haz","Had","Hab","aaaaaa"};

        /*
        * Had Haz Haa Hab
        * Had Haa Haz Hab
        * Haa Had Hab Haz
        * Haa Hab Had Haz
        * */
        int b = 0;

       for(int j = 0;j<a.length;j++){
             for (int i = b;i<a.length-1;i+=2){
                 if(a[i].compareToIgnoreCase(a[i+1])>0){
                   String c = a[i+1];
                   a[i+1] = a[i];
                   a[i] = c;
                 }


            }
           if (b==0){
                 b = 1;
           }else {b = 0;}
        }
                             for(int i = 0;i<a.length;i++){
                                System.out.println(a[i]);
                             }



    }
}














