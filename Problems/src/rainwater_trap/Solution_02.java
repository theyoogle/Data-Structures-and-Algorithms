package rainwater_trap;

public class Solution_02 {

    public static int getTrappedWater(int[] heights) {
        int totalTrappedWater = 0;
        int left = 0;
        int right = heights.length - 1;

        int leftMaxHeight = heights[left];
        int rightMaxHeight = heights[right];

        while (left < right) {
            if (heights[left] <= heights[right]) {
                if (leftMaxHeight < heights[left]) {
                    leftMaxHeight = heights[left];
                } else {
                    int currentTrappedWater = leftMaxHeight - heights[left];
                    totalTrappedWater += currentTrappedWater;
                }
                left++;
            } else {
                if (rightMaxHeight < heights[right]) {
                    rightMaxHeight = heights[right];
                } else {
                    int currentTrappedWater = rightMaxHeight - heights[right];
                    totalTrappedWater += currentTrappedWater;
                }
                right--;
            }
        }

        return totalTrappedWater;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};
        System.out.println(getTrappedWater(arr));
    }
}
