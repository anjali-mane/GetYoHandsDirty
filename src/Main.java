import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");
        Scanner sc = new Scanner(System.in);
//        System.out.println("My name is "+ sc.next());
//        int a = 123_000_000;
//        byte b = (byte)a;
//        System.out.println("byte b = "+b);
//        float tempF, tempC;
//        System.out.println("Temperature in Celsius is ");
//        tempC = sc.nextFloat();
//        tempF = (tempC *9/5) +32;
//        System.out.println("Temperature in Fahrenheit is " + tempF);

        int [][] arr= new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(Arrays.toString(arr[i]));
        }

        for (int[] i : arr)
        {
            System.out.println(Arrays.toString(i));
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);



    }
}