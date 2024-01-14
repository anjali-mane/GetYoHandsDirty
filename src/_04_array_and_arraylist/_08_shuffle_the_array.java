package _04_array_and_arraylist;

import java.util.Arrays;

public class _08_shuffle_the_array
{
    /*Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].*/
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,nums.length/2)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr= new int[nums.length];
        int start = 0;
        int end = 2*n-1;
        while (start<end)
        {
            arr[start+start]=nums[start];
            arr[end-start]=nums[end];

            start++;
            end--;
        }

        return arr;

    }
}
