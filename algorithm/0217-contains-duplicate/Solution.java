class Solution {

    // Return if any value appears at least twice in the array
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<Integer>();

        for (int num : nums) {
            if (!uniques.add(num)) { return true; }
        }

        return false;
    }
}