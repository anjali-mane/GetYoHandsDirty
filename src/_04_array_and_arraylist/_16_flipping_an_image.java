package _04_array_and_arraylist;

import java.util.Arrays;

public class _16_flipping_an_image
{
    /*Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]*/
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        for(int[] i:flipAndInvertImage(image))
        {
            System.out.println(Arrays.toString(i));
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        //reverse image
        for (int i = 0; i < image.length; i++) {
            int temp=0;
            for (int j = 0; j < image[i].length/2; j++) {
                temp=image[i][j];
                image[i][j]=image[i][image[i].length-1-j];
                image[i][image[i].length-1-j]=temp;
            }
        }

        //invert image
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j]=1-image[i][j];
            }
        }
        return image;
    }
}
