package _03_functions;

import java.util.Scanner;

public class _08_grade_calculator
{
    public static void main(String[] args) {
        /*Write a program that will ask the user to enter his/her marks (out of 100).
        Define a method that will display grades according to the marks entered as below:
            Marks        Grade
            91-100         AA
            81-90          AB
            71-80          BB
            61-70          BC
            51-60          CD
            41-50          DD
            <=40          Fail */
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Grade Calculator-----");
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter marks out of 100: ");
            int marks = sc.nextInt();
            if (100 >= marks && marks >= 91) {
                System.out.println("AA");
            } else if (90 >= marks && marks >= 81) {
                System.out.println("AB");
            }else if (80 >= marks && marks >= 71){
                System.out.println("BB");
            } else if (70 >= marks && marks >= 61) {
                System.out.println("BC");
            }else if (60 >= marks && marks >= 51){
                System.out.println("CC");
            } else if (50 >= marks && marks >= 41) {
                System.out.println("CD");
            }else if (40 >= marks){
                System.out.println("Fail");
            }
        }


    }
}
