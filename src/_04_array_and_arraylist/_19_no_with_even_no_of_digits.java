package _04_array_and_arraylist;

public class _19_no_with_even_no_of_digits
{   /*Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.*/
    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int ecount=0;
        for (int j : nums) {
            int dcount=0;
            int num = j;
            while (num > 0) {
                num /= 10;
                dcount++;
            }
            if (dcount % 2 == 0) {
                ecount++;
            }
        }

        return ecount;
    }
}
