package _03_functions;

import java.util.Scanner;

public class _03_eligible_voter_check
{
    public static void main(String[] args) {
        //A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        eligibleVoterCheck(age);
    }

    static void eligibleVoterCheck(int age)
    {
        if (age>=18)
        {
            System.out.println("Eligible for voting!!");
        }else {
            System.out.println("Non-eligible for voting!!");
        }
    }
}
