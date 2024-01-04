package _02_conditionals_loops.basic;

import java.util.Scanner;

public class _11_perimeter_of_rectangle
{
    public static void main(String[] args) {
        //P=2(l+w)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of l & w: ");
        float l = sc.nextFloat();
        float w = sc.nextFloat();
        System.out.println("Perimeter of rectangle is: "+ String.format("%.2f",2*(l+w)));


    }
}
