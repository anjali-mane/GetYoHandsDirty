package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _22_factors_of_a_number
{
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Factors of"+n+" are: ");
        for (int i = 1; i <=n ; i++) {
            if (n%i ==0) {
                System.out.println(i);
            }
        }
    }
}
