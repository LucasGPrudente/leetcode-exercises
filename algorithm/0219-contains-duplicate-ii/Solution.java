class Solution {

    // Return if there are two distinct indices in the array such that nums[i] == nums[j] and abs(i - j) <= k
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, ArrayList<Integer>> elements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!elements.containsKey(nums[i])) { elements.put(nums[i], new ArrayList<Integer>()); }

            elements.get(nums[i]).add(i);
        }

        for (Map.Entry<Integer, ArrayList<Integer>> entry : elements.entrySet()) {
            List<Integer> list = entry.getValue();

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) - list.get(i - 1) <= k) { return true; }
            }
        }

        return false;
    }
}