class Solution {

    // Check if the array could become non-decreasing by modifying at most one element
    public boolean checkPossibility(int[] arr) {
        int cnt = 0;
        int idx = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                if (cnt == 1) { return false; }

                cnt++;
                idx = i - 1;
            }
        }

        if (cnt == 0) { return true; }

        if (idx == 0 || idx == arr.length - 2) { return true; }

        return arr[idx - 1] <= arr[idx + 1] || arr[idx] <= arr[idx + 2];
    }
}