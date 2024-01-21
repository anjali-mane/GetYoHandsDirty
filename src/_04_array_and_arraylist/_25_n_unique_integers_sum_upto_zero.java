package _04_array_and_arraylist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class _25_n_unique_integers_sum_upto_zero
{
    /*Given an integer n, return any array containing n unique integers such that they add up to 0.
Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].*/
    public static void main(String[] args) {
        int n =5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    static int[] sumZero(int n) {
        int[] output = new int[n];
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            int randomNum;
            do {
                randomNum = random.nextInt(1000);
            } while (uniqueNumbers.contains(randomNum));

            uniqueNumbers.add(randomNum);
            output[i] = randomNum;
            sum += output[i];
        }

        output[n - 1] = -sum;
        return output;
    }
}
