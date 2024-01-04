package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _7_area_of_equilateral_triangle
{
    public static void main(String[] args) {
        //A= √3/4 × (side)2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of side: ");
        float side = sc.nextFloat();
        System.out.println("Area of equilateral triangle: "+String.format("%.2f",Math.pow(side,2)*Math.sqrt(3)*0.25));
    }
}
