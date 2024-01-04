package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _16_volume_of_cylinder {
    public static void main(String[] args) {
        //V=πr2h
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of r & h: ");
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Volume of cylinder is: "+ String.format("%.2f",Math.PI*Math.pow(r,2)*h));

    }
}
