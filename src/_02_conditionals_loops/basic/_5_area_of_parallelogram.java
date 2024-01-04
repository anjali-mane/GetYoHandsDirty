package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _5_area_of_parallelogram
{
    public static void main(String[] args) {
        //A=bh
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of b and h: ");
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Area of parallelogram: "+b*h);
    }
}
