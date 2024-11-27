class Solution {

    // Arrange the list of non-negative integers nums such that they form the largest number
    public String largestNumber(int[] nums) {
        String[] numbers = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numbers[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

        if (numbers[0].equals("0")) { return "0"; }

        StringBuilder answer = new StringBuilder();

        for (String n : numbers) {
            answer.append(n);
        }

        return answer.toString();
    }
}