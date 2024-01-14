package _04_array_and_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_swap_elements
{
    public static void main(String[] args) {
        int [] arr = {12,23,34,54,67};
        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr,int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
