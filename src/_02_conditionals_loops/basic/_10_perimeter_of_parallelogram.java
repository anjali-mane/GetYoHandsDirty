package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _10_perimeter_of_parallelogram
{
    public static void main(String[] args) {
        //P=2(a+b)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a & b: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Perimeter of parallelogram is: "+ String.format("%.2f",2*(a*b)));


    }
}
