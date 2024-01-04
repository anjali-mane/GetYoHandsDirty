package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _17_volume_of_sphere
{
    public static void main(String[] args) {
        //V = 4/3 π r³
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r = sc.nextFloat();
        System.out.println("Volume of sphere is: "+ String.format("%.2f",((4.0/3.0)*(Math.PI)*(Math.pow(r,3)))));

    }
}
