package _03_functions;

import java.util.Scanner;

public class _07_prime_no_check
{
    public static void main(String[] args) {
        //Define a method to find out if a number is prime or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Prime number check-----");
        System.out.println("Enter number to be checked: ");
        int n = sc.nextInt();
        System.out.println(primeCheck(n));
    }

    static boolean primeCheck(int n) 
    {
        if (n == 0 || n==1)
        {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n); i++)
        {
            if (n%i == 0) {
                return false;
            }
        }
        return true;

    }
}
