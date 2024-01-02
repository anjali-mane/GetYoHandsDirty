package _01_first_java;

import java.util.Scanner;

public class _4_operations
{
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number: ");
        int b= sc.nextInt();
        System.out.println("Enter operation you want to perform(+,-,*,/): ");
        String s= sc.next();
        if(s.equals("+"))
        {
            System.out.println("Addition of given numbers is: "+ (a+b));
        } else if (s.equals("-")) {
            System.out.println("Subtraction of given numbers is: "+ (a-b));
        } else if (s.equals("*")) {
            System.out.println("Multiplication of given numbers is: "+ (a*b));
        }else if(s.equals("/")){
            System.out.println("Division of given numbers is: "+(a/b));
        }else {
            System.out.println("Illegal operator entered!!!");
        }


    }
}
