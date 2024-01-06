package _03_functions;

import java.util.Scanner;

public class _06_circumference_and_area_of_circle
{
    public static void main(String[] args) {
        //Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Calculate circumference & area of circle-----");
        System.out.println("Enter radius of circle: ");
        float r = sc.nextFloat();
        circumference(r);
        area(r);
    }

    static void circumference(float r) {
        System.out.printf("Circumference of circle is: %.2f",2*Math.PI*r);
        System.out.println();
    }

    static void area(float r) {
        System.out.printf("Area of circle is: %.2f",Math.PI*Math.pow(r,2));
    }
}
