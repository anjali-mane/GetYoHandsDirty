package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _9_perimeter_of_equilateral_triangle
{

    public static void main(String[] args) {
        //P=3a
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        float a = sc.nextFloat();
        System.out.println("Perimeter of equilateral triangle is: "+ String.format("%.2f",3*a));

    }
}
