package _04_array_and_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _12_target_array_in_given_order
{
    /*Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]*/
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i],nums[i]);
        }
        int[] ret = new int[target.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = target.get(i);
        }
        return ret;
    }
}
