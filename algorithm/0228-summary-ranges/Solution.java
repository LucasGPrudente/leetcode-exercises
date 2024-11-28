class Solution {

    // Return the smallest sorted list of ranges that cover all the numbers in the array exactly
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<String>();

        for (int j = 0; j < nums.length; j++) {
            int i = j;

            while (j < nums.length - 1) {
                if (nums[j] != nums[j + 1] - 1) { break; }

                j++;
            }

            StringBuilder range = new StringBuilder();

            if (i == j) {
                range.append(nums[i]);
            } else {
                range.append(nums[i]).append("->").append(nums[j]);
            }

            ranges.add(range.toString());
        }

        return ranges;
    }
}