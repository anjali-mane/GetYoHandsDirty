package _01_first_java;

import java.util.Scanner;

public class _9_armstrong_no
{
    public static void main(String[] args) {
        //To find Armstrong Number between two given number.
        //Armstrong number is a number that is equal to the sum of cubes of its digits
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number: ");
        int b= sc.nextInt();
        int sum=0;
        int t=a;
        while(t>0)
        {
            int temp= t%10;
            sum+= temp*temp*temp;
            t=t/10;

        }
        System.out.println(sum == a ? "a is armstrong number!!" : "b is armstrong number!!");


    }
}
