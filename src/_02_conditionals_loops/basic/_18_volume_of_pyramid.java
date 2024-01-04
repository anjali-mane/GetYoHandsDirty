package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _18_volume_of_pyramid
{
    public static void main(String[] args) {
        //volume=1/3*l*w*h
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l, w & h: ");
        float l = sc.nextFloat();
        float w = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Volume of pyramid is: "+ String.format("%.2f",l*w*h/3));

    }
}
