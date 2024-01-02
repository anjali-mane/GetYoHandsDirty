package _01_first_java;

import java.util.Scanner;

public class _3_simple_interest
{
    public static void main(String[] args) {
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        //SI=PRT/100
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of principal:");
        float p= sc.nextInt();
        System.out.println("Enter value of time:");
        float t= sc.nextInt();
        System.out.println("Enter value of rate:");
        float r= sc.nextInt();
        float SI = p*t*r/100;
        System.out.println("Simple interest is: "+ SI);



    }
}
