// Return the maximum sum of like-time coefficient that the chef can obtain after preparing some amount of dishes

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int len = satisfaction.length;

        Arrays.sort(satisfaction);

        // Only negatives
        if (satisfaction[len - 1] < 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            int sum = 0;

            for (int j = i, t = 1; j < len; j++, t++) {
                sum += satisfaction[j] * t;
            }

            if (sum < max) {
                break;
            }

            max = sum;
        }

        return max;
    }
}