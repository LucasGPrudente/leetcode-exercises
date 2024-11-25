class Solution {

    // Return the minimum minutes difference between any two time-points in the list
    public int findMinDifference(List<String> timePoints) {
        Set<Integer> set = new HashSet<>();

        for (String time : timePoints) {
            int hour = Integer.parseInt(time.substring(0, 2));
            int minute = Integer.parseInt(time.substring(3, 5));

            int timeInMinutes = (hour * 60) + minute;

            if (!set.add(timeInMinutes)) { return 0; }
        }

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        list.add(list.get(0) + (24 * 60));

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }

        return min;
    }
}