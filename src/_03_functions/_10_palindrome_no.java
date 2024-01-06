package _03_functions;

import java.util.Scanner;

public class _10_palindrome_no
{
    public static void main(String[] args) {
        //Write a function to find if a number is a palindrome or not. Take number as parameter.
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Palindrome check-----");
        System.out.println("Enter number to be checked: ");
        int n = sc.nextInt();
        palindromeCheck(n);
    }

    static void palindromeCheck(int n) {
        int reversed = 0;
        int t=n;
        while (t>0)
        {
            reversed=reversed*10+t%10;
            t/=10;
        }
        if (reversed == n) {
            System.out.println("Palindrome!!");
        }else {
            System.out.println("Not palindrome!!");
        }
    }
}
