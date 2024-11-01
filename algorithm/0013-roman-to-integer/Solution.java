// Convert the roman numeral to an integer

class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int previousNum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int val = 0;

            switch (s.charAt(i)) {
                case 'I' -> val = 1;
                case 'V' -> val = 5;
                case 'X' -> val = 10;
                case 'L' -> val = 50;
                case 'C' -> val = 100;
                case 'D' -> val = 500;
                case 'M' -> val = 1000;
            }

            if (val >= previousNum) {
                num += val;
            } else {
                num -= val;
            }

            previousNum = val;
        }

        return num;
    }
}