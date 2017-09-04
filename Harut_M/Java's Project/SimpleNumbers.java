package com.company;

public class SimpleNumbers {

    public static void main(String[] args) {


        for (int a = 1; a <500; a++){
            boolean c = true;
            for (int b = 2; b < a; b++){


                if (a % b == 0){
                    c = false;
                }


                }

              if (c) {
                  System.out.println(a);
              }


        }











    }
}
