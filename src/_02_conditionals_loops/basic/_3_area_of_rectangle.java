package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _3_area_of_rectangle
{
    public static void main(String[] args) {
        // length × width
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        float l = sc.nextFloat();
        System.out.println("Enter width: ");
        float w = sc.nextFloat();
        System.out.println("Area of rectangle is: "+ String.format("%.2f",l*w));
    }
}
