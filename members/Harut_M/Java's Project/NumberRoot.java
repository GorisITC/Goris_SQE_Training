package com.company;

public class NumberRoot {

    public static void main(String[] args) {

        int a = 29;


        for (int i = 1; i < a; i++) {
            if (i * i == a) {
                System.out.println(i);
                break;
            }
            if (i * i > a) {
                System.out.println("Tiv@ armat chuni ok?");
                break;
            }


        }


    }
}
