package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _4_area_of_isosceles_triangle
{
    public static void main(String[] args) {
        // A= ½[√(a2 − b2 /4) × b]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Area of isosceles triangle is: "+String.format("%.2f",(Math.sqrt(4*Math.pow(a,2)-Math.pow(b,2))*b)*0.25));


    }
}
