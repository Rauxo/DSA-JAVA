import java.util.*;

public class TrappedWater {
    public static int trappedRainWater(int heights[]) {
        int n = heights.length;
        // calculate left max boundary - using array
        int leftMax[] = new int[heights.length];
        leftMax[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }
        // calculate right max boundary - using array
        int rightMax[] = new int[heights.length];
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
        }

        int trappedRainWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // water level -= min(leftMaxBoundary , rightMaxBoundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = water level - height[i]
            trappedRainWater += waterLevel - heights[i];
        }
        return trappedRainWater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainWater(height));
    }
}
