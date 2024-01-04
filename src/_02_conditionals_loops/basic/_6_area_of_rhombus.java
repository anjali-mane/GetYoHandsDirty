package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _6_area_of_rhombus
{
    public static void main(String[] args) {
        //A=d1*d2/2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of d1 & d2: ");
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        System.out.println("Area of Rhombus is: "+d1*d2/2);
    }
}
