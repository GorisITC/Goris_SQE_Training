import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] argss){
        Scanner mystring = new Scanner(System.in);
        System.out.print("Enter a String ");
        String str = mystring.nextLine();
        String reverse = "";
        for (int i = str.length() -1; i >= 0; i-- ){
            reverse += str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not Palindrome!");
        }
    }
}