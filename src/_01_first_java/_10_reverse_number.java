package _01_first_java;

import java.util.Scanner;

public class _10_reverse_number {
    public static void main(String[] args) {
        //reverse the given number for example. 23456 to 65432
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be reversed: ");
        int n= sc.nextInt();
        int a=n;
        int b=0;
        while(a>0)
        {
            b=(b*10)+(a%10);
            a=a/10;
        }
        System.out.println("Reversed number is: "+b);

    }
}
