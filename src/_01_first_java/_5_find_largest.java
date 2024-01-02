package _01_first_java;

import java.util.Scanner;

public class _5_find_largest
{
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number: ");
        int b= sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater than b");
        }else {
            System.out.println("b is greater than a");
        }
    }
}
