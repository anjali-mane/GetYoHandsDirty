package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _24_largest_input
{
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int max = 0;
        int n;
        do {
            n= sc.nextInt();
            if(n>max)
            {
                max=n;
            }

        }while (n!=0);
        System.out.println("Largest of all inputs is: "+max);
    }
}
