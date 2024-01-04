package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _15_volume_of_prism
{
    public static void main(String[] args) {
        // V = B × H
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of b & h: ");
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Volume of prism is: "+ String.format("%.2f",b*h));

    }
}
