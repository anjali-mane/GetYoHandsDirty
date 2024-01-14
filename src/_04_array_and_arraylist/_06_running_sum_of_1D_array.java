package _04_array_and_arraylist;

import java.util.Arrays;

public class _06_running_sum_of_1D_array
{
    /*Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4*/
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));;
    }
    static int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
