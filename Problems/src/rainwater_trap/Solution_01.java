package rainwater_trap;

public class Solution_01 {

    public static int getTrappedWater(int[] heights) {
        int totalTrappedWater = 0;
        int current = 0;

        while (current< heights.length) {
            int leftMaxHeight = heights[current];
            int left = current;
            while (left >= 0) {
                if (leftMaxHeight < heights[left]) {
                    leftMaxHeight = heights[left];
                }
                left--;
            }

            int rightMaxHeight = heights[current];
            int right = current;
            while (right < heights.length) {
                if (rightMaxHeight < heights[right]) {
                    rightMaxHeight = heights[right];
                }
                right++;
            }

            int minHeight = Math.min(leftMaxHeight, rightMaxHeight);
            int currentTrappedWater = minHeight - heights[current];
            totalTrappedWater += currentTrappedWater;

            current++;
        }

        return totalTrappedWater;
    }

    public static void main(String[] args) {
        int[] arr = { 0,1,0,2,1,0,3,1,0,1,2 };
        System.out.println(getTrappedWater(arr));
    }
}
