package _03_functions;

import java.util.Scanner;

public class _02_even_odd_no
{
    public static void main(String[] args) {
        //Define a program to find out whether a given number is even or odd.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be checked: ");
        int n = sc.nextInt();
        isevenodd(n);
    }

    static void isevenodd(int n)
    {
        if (n%2 == 0) {
            System.out.println("Even number!!");
        }else {
            System.out.println("Odd number!!");
        }
    }
}
