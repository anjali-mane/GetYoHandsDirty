package _04_array_and_arraylist;

public class _02_max_item
{
    public static void main(String[] args) {
        int[] arr = {12,23,43,76,23,54,98,12};
        max(arr);
    }

    static void max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Max item is: "+max);
    }
}
