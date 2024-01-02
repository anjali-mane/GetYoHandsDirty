package _01_first_java;

import java.util.Scanner;

public class _2_greetings
{
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello there "+ sc.next());
    }
}
