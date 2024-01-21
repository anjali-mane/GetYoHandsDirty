package _04_array_and_arraylist;

import java.util.Arrays;

public class _17_cells_with_odd_values_in_matrix
{
    /*There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.*/
    public static void main(String[] args) {
       int m = 2;
       int n = 3;
       int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    static int oddCells(int m, int n, int[][] indices) {
        int r,c,odds=0;
        int[][] matrix = new int[m][n];
        for(int[] i:matrix)
        {
            for(int j:i)
            {
                j=0;
            }
        }
        for (int i = 0; i < indices.length; i++) {
                r=indices[i][0];
                c=indices[i][1];
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    if (j==r)
                    {
                        matrix[j][k]++;
                    }
                    if (k==c)
                    {
                        matrix[j][k]++;
                    }

                }
            }
        }
        for(int[] i:matrix)
        {
            for(int j:i)
            {
                if (j%2 != 0) {
                    odds++;
                }
            }
        }
        return odds;
    }
}
