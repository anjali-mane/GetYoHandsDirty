package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _21_fibonacci_series
{
    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc
        Scanner sc = new Scanner(System.in);
        System.out.println("***** PRINT nth NUMBER FROM FIBONACCI SERIES *****");
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int n1= 0;
        int n2= 1;
        int n3=0;
        int count=2;
        while(count!=n)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            count++;
        }
        System.out.println(n+"th number from fibonacci series is: "+n3);
    }
}
