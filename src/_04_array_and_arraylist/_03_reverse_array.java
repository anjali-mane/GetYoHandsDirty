package _04_array_and_arraylist;

import java.util.Arrays;

public class _03_reverse_array
{
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,99};
        reverse(arr);
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
