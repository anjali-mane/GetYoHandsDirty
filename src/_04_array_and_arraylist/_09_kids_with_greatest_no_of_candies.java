package _04_array_and_arraylist;

import java.util.ArrayList;
import java.util.List;

public class _09_kids_with_greatest_no_of_candies
{
    /*Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.*/
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));;
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]>max)
            {
                max=candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {

            if (candies[i]+extraCandies >=max ) {
                result.add(i,true);
            }else {
                result.add(i,false);
            }
        }

        return result;
    }
}
