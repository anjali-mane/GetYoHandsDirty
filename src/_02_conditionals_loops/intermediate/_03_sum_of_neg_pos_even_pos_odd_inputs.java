package _02_conditionals_loops.intermediate;

import java.util.Scanner;

public class _03_sum_of_neg_pos_even_pos_odd_inputs
{
    public static void main(String[] args) {
        //Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        Scanner sc = new Scanner(System.in);
        int n;
        int sum_of_neg_no=0,sum_of_pos_even_no=0,sum_of_pos_odd_no=0;
        System.out.println("Enter numbers(exit=0): ");
        n=sc.nextInt();
        if(n<0)
        {
            sum_of_neg_no+=n;
        } else if (n>0 && n%2==0)
        {
            sum_of_pos_even_no+=n;
        }else if (n>0 && n%2!=0)
        {
            sum_of_pos_odd_no+=n;
        }
        while (n != 0) {
            n = sc.nextInt();
            if (n < 0) {
                sum_of_neg_no += n;
            } else if (n > 0 && n % 2 == 0) {
                sum_of_pos_even_no += n;
            } else if (n > 0 && n % 2 != 0) {
                sum_of_pos_odd_no += n;
            }
        }
        System.out.println("sum of negative numbers is: "+sum_of_neg_no);
        System.out.println("sum of positive even numbers is: "+sum_of_pos_even_no);
        System.out.println("sum of positive odd numbers is: "+sum_of_pos_odd_no);

    }
}
