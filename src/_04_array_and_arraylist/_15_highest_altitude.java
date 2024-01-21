package _04_array_and_arraylist;

public class _15_highest_altitude
{
    /*There is a biker going on a road trip. The road trip consists of n + 1 points at different itudes. The biker starts his trip on point 0 with itude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in itude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the alt itude of a point.

 Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The itudes are [0,-5,-4,1,1,-6]. The alt is 1.*/
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestitude(gain));
    }
    static int largestitude(int[] gain) {
        int highest = 0,alt=0;
        int[] altitude= new int[gain.length+1];
        altitude[0]=0;
        for (int i = 0; i < gain.length; i++) {
            alt+=gain[i];
            altitude[i+1]=alt;
            if (alt >highest) {
                highest=alt;
            }
        }
        return highest;
    }
}
