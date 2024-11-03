class Solution {

    // Convert an integer to a Roman numeral
    public String intToRoman(int num) {
        int[] values = decomposeNum(num);
        StringBuilder output = new StringBuilder();

        for (int val : values) {
            switch (val) {
                case 1 -> output.append("I");
                case 2 -> output.append("II");
                case 3 -> output.append("III");
                case 4 -> output.append("IV");
                case 5 -> output.append("V");
                case 6 -> output.append("VI");
                case 7 -> output.append("VII");
                case 8 -> output.append("VIII");
                case 9 -> output.append("IX");
                case 10 -> output.append("X");
                case 20 -> output.append("XX");
                case 30 -> output.append("XXX");
                case 40 -> output.append("XL");
                case 50 -> output.append("L");
                case 60 -> output.append("LX");
                case 70 -> output.append("LXX");
                case 80 -> output.append("LXXX");
                case 90 -> output.append("XC");
                case 100 -> output.append("C");
                case 200 -> output.append("CC");
                case 300 -> output.append("CCC");
                case 400 -> output.append("CD");
                case 500 -> output.append("D");
                case 600 -> output.append("DC");
                case 700 -> output.append("DCC");
                case 800 -> output.append("DCCC");
                case 900 -> output.append("CM");
                case 1000 -> output.append("M");
                case 2000 -> output.append("MM");
                case 3000 -> output.append("MMM");
            }
        }

        return output.toString();
    }

    // Decompose the number
    public int[] decomposeNum(int num) {
        int len = String.valueOf(num).length();
        int exp = (int) Math.pow(10, len - 1);
        int[] values = new int[len];

        for (int i = 0; num > 0; i++) {
            values[i] = (num / exp) * exp;

            num = num % exp;
            exp = exp / 10;
        }

        return values;
    }
}