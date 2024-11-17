class Solution {

    // Return the rowIndex-th row of the Pascal's triangle
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lastRow = new ArrayList<>();

        lastRow.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);

            for (int j = 1; j < lastRow.size(); j++) {
                currRow.add(lastRow.get(j) + lastRow.get(j - 1));
            }

            currRow.add(1);

            lastRow = currRow;
        }

        return lastRow;
    }
}