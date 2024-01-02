package _01_first_java;

import java.util.Scanner;

public class _8_palindrome {
    public static void main(String[] args) {
        //To find out whether the given String is Palindrome or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to be checked: ");
        String s = sc.next();
        int l = s.length();
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            r = r + s.charAt(i);
        }
        if (s.toLowerCase().equals(r.toLowerCase())) {
            System.out.println("Palindrome!!");
        } else {
            System.out.println("Not Palindrome!!");
        }
    }
}
