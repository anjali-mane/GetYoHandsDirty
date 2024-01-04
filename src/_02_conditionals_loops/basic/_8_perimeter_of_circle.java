package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _8_perimeter_of_circle
{
    public static void main(String[] args) {
        //C=2πr
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r = sc.nextFloat();
        System.out.println("Perimeter of circle is: "+ String.format("%.2f",2*Math.PI*r));

    }
}
