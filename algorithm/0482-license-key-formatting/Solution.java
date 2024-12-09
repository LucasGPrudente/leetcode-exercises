class Solution {

    // Return the reformatted license key
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder noDashes = new StringBuilder();

        for (int i = 0; i < s.length();) {
            int chr = k;

            while (i < s.length() && chr > 0) {
                char c = s.charAt(i);

                if (c != '-') {
                    noDashes.append((c >= 'a' && c <= 'z') ? Character.toUpperCase(c) : c);
                    chr--;
                }

                i++;
            }
        }

        int lenStr = noDashes.length();
        int lenArr = (int) Math.ceil((double) noDashes.length() / k);

        if (lenArr <= 0) { return noDashes.toString(); }

        String[] groups = new String[lenArr];

        for (int i = lenArr - 1, j = lenStr; i >= 0; i--, j -= k) {
            String group = noDashes.substring(Math.max((j - k), 0), j);

            groups[i] = group;
        }

        return String.join("-", groups);
    }
}