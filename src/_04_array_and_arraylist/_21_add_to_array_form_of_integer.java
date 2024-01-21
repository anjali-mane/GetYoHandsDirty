package _04_array_and_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _21_add_to_array_form_of_integer
{
    /*The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234*/
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(num,k));
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0;
        List<Integer>ans=new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            int p=num[i]+k%10+carry;
            k/=10;
            num[i]=p%10;
            carry=p/10;
        }

        while(k>0){
            int p=k%10+carry;

            ans.add(0,p%10);
            carry=p/10;
            k/=10;
        }
        if(carry>0){
            ans.add(0,carry);
        }

        for(int i=0;i<num.length;i++){
            ans.add(num[i]);
        }
        return ans;
    }
}
