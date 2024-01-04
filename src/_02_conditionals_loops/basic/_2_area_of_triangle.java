package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _2_area_of_triangle {
    public static void main(String[] args) {
        //A = ½ (b × h)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        float b = sc.nextFloat();
        System.out.println("Enter height: ");
        float h = sc.nextFloat();
        System.out.println("Area of triangle is: "+ String.format("%.2f",(b*h)/2));
    }
}
