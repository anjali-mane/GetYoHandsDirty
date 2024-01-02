import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");
        Scanner sc = new Scanner(System.in);
        System.out.println("My name is "+ sc.next());
        int a = 123_000_000;
        byte b = (byte)a;
        System.out.println("byte b = "+b);
        float tempF, tempC;
        System.out.println("Temperature in Celsius is ");
        tempC = sc.nextFloat();
        tempF = (tempC *9/5) +32;
        System.out.println("Temperature in Fahrenheit is " + tempF);

    }
}