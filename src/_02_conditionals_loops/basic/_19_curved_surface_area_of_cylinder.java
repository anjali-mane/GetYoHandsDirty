package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _19_curved_surface_area_of_cylinder
{
    public static void main(String[] args) {
        //2πrh
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r & h: ");
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Curved surface area of cylinder is: "+ String.format("%.2f",(2*(Math.PI)*r*h)));


    }
}
