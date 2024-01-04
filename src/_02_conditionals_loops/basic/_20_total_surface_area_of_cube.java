package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _20_total_surface_area_of_cube
{
    public static void main(String[] args) {
        //a= = 6s^2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of s: ");
        float s = sc.nextFloat();
        System.out.println("Total surface area of cube: "+String.format("%.2f",6*Math.pow(s,2)));

    }
}
