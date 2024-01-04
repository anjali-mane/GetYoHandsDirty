package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _12_perimeter_of_square
{
    public static void main(String[] args) {
        //P=4a
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        float a = sc.nextFloat();
        System.out.println("Perimeter of square is: "+ String.format("%.2f",4*a));

    }
}
