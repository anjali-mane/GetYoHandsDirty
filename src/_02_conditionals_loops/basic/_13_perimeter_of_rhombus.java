package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _13_perimeter_of_rhombus
{
    public static void main(String[] args) {
        //Perimeter = 2 √d1^2+ d2^2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of d1 & d2: ");
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        System.out.println("Perimeter of rhombus is: "+ String.format("%.2f",2*Math.sqrt(Math.pow(d1,2)+Math.pow(d2,2))));

    }
}
