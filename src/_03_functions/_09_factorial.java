package _03_functions;

import java.util.Scanner;

public class _09_factorial
{
    public static void main(String[] args) {
        //Write a program to print the factorial of a number by defining a method named 'Factorial'.
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Factorial calculator-----");
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+ factorial(n));
    }

    static int factorial(int n) {
        if(n==0)
        {
            return 0;
        } else if (n==1) {
            return 1;
        }
        return n*factorial(n-1);

    }
}
