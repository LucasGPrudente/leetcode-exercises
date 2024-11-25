class Solution {

    // Return the sorted string
    public String frequencySort(String s) {
        Map<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pQueue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pQueue.addAll(count.entrySet());

        StringBuilder result = new StringBuilder();

        while (!pQueue.isEmpty()) {
            Map.Entry<Character, Integer> entry = pQueue.poll();

            char chr = entry.getKey();
            int freq = entry.getValue();

            while (freq > 0) {
                result.append(chr);
                freq--;
            }
        }

        return result.toString();
    }
}