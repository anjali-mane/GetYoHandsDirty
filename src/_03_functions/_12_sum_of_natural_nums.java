package _03_functions;

import java.util.Scanner;

public class _12_sum_of_natural_nums
{
    public static void main(String[] args) {
        //Write a function that returns the sum of first n natural numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if (n<=0)
        {
            System.out.println("Not natural number");
        }else {
            System.out.println("Sum of first " + n + " natural numbers is: " + sumOfNaturalNums(n));
        }
        }

    static int sumOfNaturalNums(int n) {
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        return sum;
    }
}
