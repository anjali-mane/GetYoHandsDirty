package _01_first_java;

import java.util.Scanner;

public class _7_fibonacci_series
{
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers.
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you wanna see fibonacci series up to: ");
        int n = sc.nextInt();
        int n1=0, n2=1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<n;++i)
        {
            int n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;

        }

    }
}
