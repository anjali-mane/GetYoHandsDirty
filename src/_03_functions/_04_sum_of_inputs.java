package _03_functions;

import java.util.Scanner;

public class _04_sum_of_inputs
{
    public static void main(String[] args) {
        //Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ot be added: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumOfInputs(a,b);
    }

    static void sumOfInputs(int a, int b)
    {
        System.out.println("Sum of "+a+ " & "+b+" is: "+(a+b));
    }
}
