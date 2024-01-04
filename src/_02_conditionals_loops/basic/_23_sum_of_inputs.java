package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _23_sum_of_inputs
{
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to be added: ");
        System.out.println("**Enter 0 to exit**");
        int s = 0;
        int n;
        do {
            n= sc.nextInt();
            s+=n;
        }while (n!=0);
        System.out.println("Sum of all inputs is: "+s);
    }
}
