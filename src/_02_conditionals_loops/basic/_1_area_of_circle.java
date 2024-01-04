package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _1_area_of_circle {
    public static void main(String[] args) {
        //A=πr2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r = sc.nextFloat();
        System.out.println("Area of circle is: "+ String.format("%.2f",(Math.PI*Math.pow(r,2))));
    }
}
