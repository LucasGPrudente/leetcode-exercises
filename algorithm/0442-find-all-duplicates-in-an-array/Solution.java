class Solution {

    // Return an array of all the integers that appears twice
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        int[] count = new int[nums.length + 1];

        for (int n : nums) {
            count[n]++;

            if (count[n] > 1) { duplicates.add(n); }
        }

        return duplicates;
    }
}