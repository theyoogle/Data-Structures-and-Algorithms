package container_with_most_water;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_01 {

    public static int getMaxArea(int[] heights) {
        int maxArea = 0;
        int i = 0;

        while (i < heights.length - 1) {
            int j = i + 1;
            while (j < heights.length) {
                int h = Math.min(heights[i], heights[j]);
                int w = j - i;
                int area = h * w;

                if (maxArea < area) {
                    maxArea = area;
                }
                j++;
            }
            i++;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<int[]> testCases = new ArrayList<>();
        testCases.add(new int[]{ 6,9,3,4,5,8 });
        testCases.add(new int[]{ 7,1,2,3,9 });
        testCases.add(new int[]{ 1,8,6,2,9,4 });
        testCases.add(new int[]{ });
        testCases.add(new int[]{ 1 });

        for (int[] arr: testCases) {
            System.out.println(Arrays.toString(arr) + " : " + getMaxArea(arr));
        }
    }
}
