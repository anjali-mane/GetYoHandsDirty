package _03_functions;

import java.util.Scanner;

public class _01_max_and_min_no
{
    public static void main(String[] args) {
        //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Max: "+max(a,b,c));
        System.out.println("Min: "+min(a,b,c));

    }

    static int max(int a, int b, int c)
    {
        int max=a;
        if(b>a && b>c)
        {
            max=b;
        }else if (c>a && c>b){
            max=c;
        }
        return max;
    }
    static int min(int a, int b, int c)
    {
        int min=a;
        if(b<a && b<c)
        {
            min=b;
        }else if (c<a && c<b){
            min=c;
        }
        return min;
    }
}
