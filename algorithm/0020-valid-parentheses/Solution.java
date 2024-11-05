class Solution {

    // Check if the input string is valid
    public boolean isValid(String s) {
        Stack sequence = new Stack();

        Map<Character, Character> table = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                sequence.push(c);
            } else if (sequence.size() > 0 && sequence.peek() == table.get(c)) {
                sequence.pop();
            } else {
                return false;
            }
        }

        return sequence.size() == 0;
    }
}