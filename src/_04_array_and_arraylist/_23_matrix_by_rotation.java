package _04_array_and_arraylist;

import java.util.Arrays;

public class _23_matrix_by_rotation
{
    /*Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
       Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
       Output: true
       Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.*/
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
//        int[][] mat = {{0,1},{1,1}};
//        int[][] target = {{1,0},{0,1}};
//        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
//        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat,target));
    }
    static boolean findRotation(int[][] mat, int[][] target) {
        int[][] rotated = new int[mat.length][mat[0].length];
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[i].length; j++) {
                rotated[i][j] = mat[i][j];
            }
        }
        int n =4;
        while (n>0)
        {
            if (Arrays.deepEquals(rotated, target))
            {
                return true;
            }
            int l=mat.length-1;
            for (int[] i : mat) {
                for (int j = 0; j < i.length; j++) {
                    rotated[j][l] = i[j];
                }
                l--;
            }

            for (int i = 0; i < rotated.length; i++) {
                for (int j = 0; j < rotated[i].length; j++) {
                    mat[i][j] = rotated[i][j];
                }
            }
            n--;
        }
        return false;
    }
}
