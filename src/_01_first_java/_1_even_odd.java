package _01_first_java;

import java.util.Scanner;

public class _1_even_odd
{
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }
}
