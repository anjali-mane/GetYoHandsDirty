package _02_conditionals_loops.intermediate;

import java.util.Scanner;

public class _04_weekdays_weekends
{
    public static void main(String[] args) {
        //print if input day is weekday or weekend
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day to be checked: ");
        String day = sc.next();
        switch (day){
            case "monday","tuesday","wednesday","thursday","friday"-> System.out.println("WEEKDAY");
            case "saturday","sunday"-> System.out.println("WEEKEND");
            default -> System.out.println("Day doesn't exists");
        }
    }
}
