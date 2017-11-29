package com.company;

public class Main {

    public static void main(String[] args) {
        String a = "Java";
        StringBuilder b = new StringBuilder(a);
        boolean k = true;
        b.reverse();
        String c = new String(b);

          if(c.compareTo(a) == 0){
           System.out.println(k);}
          else {
           System.out.println(!k);

        }
    }
}
























