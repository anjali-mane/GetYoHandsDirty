package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _14_volume_of_cone
{
    public static void main(String[] args) {
        //V=π*r^2*h/3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of r & h: ");
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Volume of cone is: "+ String.format("%.2f",Math.PI*Math.pow(r,2)*h/3));

    }
}
