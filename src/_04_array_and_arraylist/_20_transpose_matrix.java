package _04_array_and_arraylist;

import java.util.Arrays;

public class _20_transpose_matrix
{
    /*Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]*/
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] i:transpose(matrix)) {
            System.out.println(Arrays.toString(i));
        }
    }
    static int[][] transpose(int[][] matrix) {
        int[][] transposeM = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeM[j][i]=matrix[i][j];
            }
        }
        return transposeM;
    }
}
