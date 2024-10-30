// Return the maximum amount of water a container can store

class Solution {
    public int maxArea(int[] height) {
        int lt = 0;
        int rt = height.length - 1;

        int curArea = (rt - lt) * (height[lt] < height[rt] ? height[lt] : height[rt]);
        int maxArea = curArea;

        while (lt < rt) {
            if (height[lt] > height[rt]) {
                rt--;
            } else {
                lt++;
            }

            curArea = (rt - lt) * (height[lt] < height[rt] ? height[lt] : height[rt]);

            if (curArea > maxArea) {
                maxArea = curArea;
            }
        }

        return maxArea;
    }
}