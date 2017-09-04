package com.company;

public class Quadratic {

    public static void main(String[] args) {
        int b = 16;
        int c = 1;
        if (b < 0) {
            System.out.println("Krkin porcir");
        }

        for (int i = 0; i < b; i++) {

            if (c == b) {
                System.out.println(i);
                break;
            } else if (c < b) {
            } else {
                System.out.println("Asenq et tivy yst qez 2-i asticana vor grel es?");
                break;
            }

            c *= 2;

        }


    }


}

