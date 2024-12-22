class Solution {

    // Return how many days to a warmer temperature for each day
    public int[] dailyTemperatures(int[] temps) {
        int len = temps.length;
        int[] ans = new int[len];
        int[] day = new int[len];

        for (int i = 0, j = 0; i < len; i++) {
            while (j >= 0 && temps[i] > temps[day[j]]) {
                ans[day[j]] = i - day[j];
                j--;
            }

            j++;
            day[j] = i;
        }

        return ans;
    }
}