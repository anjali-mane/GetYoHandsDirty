package _03_functions;

import java.util.Scanner;

public class _11_prime_nos_in_range
{
    public static void main(String[] args) {
        //Write a function that returns all prime numbers between two given numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Prime numbers in this range are: ");
        primeNumbersInRange(a,b);
    }

    static void primeNumbersInRange(int a, int b) {

        for (int i = a; i <=b ; i++) {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
