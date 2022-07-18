package container_with_most_water;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_02 {

    public static int getMaxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int h = Math.min(heights[left], heights[right]);
            int w = right - left;
            int area = h * w;

            if (maxArea < area) {
                maxArea = area;
            }

            if (heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }
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
