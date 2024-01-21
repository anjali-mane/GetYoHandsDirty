package _04_array_and_arraylist;

import java.util.ArrayList;
import java.util.List;

public class _14_count_items_matching_a_rule
{
    /*You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].*/
    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();
        List<String> innerList1 = new ArrayList<>();
        innerList1.add("phone");
        innerList1.add("blue");
        innerList1.add("pixel");

        List<String> innerList2 = new ArrayList<>();
        innerList2.add("computer");
        innerList2.add("silver");
        innerList2.add("lenovo");

        List<String> innerList3 = new ArrayList<>();
        innerList3.add("phone");
        innerList3.add("gold");
        innerList3.add("iphone");

        listOfLists.add(innerList1);
        listOfLists.add(innerList2);
        listOfLists.add(innerList3);

        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(listOfLists,ruleKey,ruleValue));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type")&& items.get(i).get(0).equals(ruleValue)) {
                count++;

            } else if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                count++;

            } else if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                count++;

            }
        }
        return count;
    }
}
