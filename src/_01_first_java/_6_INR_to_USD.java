package _01_first_java;

import java.util.Scanner;

public class _6_INR_to_USD
{
    public static void main(String[] args) {
        //Input currency in rupees and output in USD.
        //USD=INR*Exchange Rate
        //1 INR= 0.01202 USD
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in INR: ");
        float INR = sc.nextFloat();
        float ER = 0.01202f;
        System.out.println("Equivalent USD: "+ INR*ER);
    }
}
