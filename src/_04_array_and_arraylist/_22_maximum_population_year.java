package _04_array_and_arraylist;

public class _22_maximum_population_year
{
    /*You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.

The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.
Return the earliest year with the maximum population.
Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.*/
    public static void main(String[] args) {
        //int[][] logs= {{1950,1961},{1960,1971},{1970,1981}};
        //int[][] logs= {{1993,1999},{2000,2010}};
        int[][] logs= {{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};

        System.out.println(maximumPopulation(logs));
    }
    static int maximumPopulation(int[][] logs) {
        int min=logs[0][0], max=logs[0][1]-1,year=0;
        for (int i = 1; i < logs.length; i++) {
            if (logs[i][0]<=max) {
                year++;
                max=logs[i][1]-1;
                if(logs[i][0]<min || year==1)
                {
                    min=logs[i][0];
                }
            }

        }
        return min;
    }
}
