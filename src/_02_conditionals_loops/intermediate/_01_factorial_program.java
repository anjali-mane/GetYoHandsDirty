package _02_conditionals_loops.intermediate;

import java.util.Scanner;

public class _01_factorial_program
{
    public static void main(String[] args) {
        //Factorial Program In Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to calculate the factorial for: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1;i<=n;i++)
        {
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
