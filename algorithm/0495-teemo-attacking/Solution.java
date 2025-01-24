class Solution {

    // Return the total number of seconds that Ashe is poisoned
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int seconds = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int interval = timeSeries[i + 1] - timeSeries[i];

            seconds += (interval > duration) ? duration : interval;
        }

        return seconds + duration;
    }
}