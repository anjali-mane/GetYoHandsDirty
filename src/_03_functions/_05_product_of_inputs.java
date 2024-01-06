package _03_functions;

import java.util.Scanner;

public class _05_product_of_inputs
{
    public static void main(String[] args) {
        //Define a method that returns the product of two numbers entered by user.

        Scanner sc = new Scanner(System.in);
        System.out.println("Entered 2 numbers to be multiplied: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of entered numbers is: "+productOfInputs(a,b));

    }

    static int productOfInputs(int a, int b)
    {
        return a*b;
    }
}
