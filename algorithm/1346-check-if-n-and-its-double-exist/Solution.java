class Solution {

    // Check if there exist two indices i and j such that arr[i] == 2 * arr[j]
    public boolean checkIfExist(int[] arr) {
        List<Integer> nums = new ArrayList<>();

        for (int x : arr) {
            if (nums.contains(x * 2) || (x % 2 == 0 && nums.contains(x / 2))) { return true; }

            nums.add(x);
        }

        return false;
    }
}