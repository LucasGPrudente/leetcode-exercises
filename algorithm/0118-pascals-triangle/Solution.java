class Solution {

    // Return the first numRows of Pascal's triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> lastRow = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> currRow = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currRow.add(1);
                } else {
                    currRow.add(lastRow.get(j) + lastRow.get(j - 1));
                }
            }

            triangle.add(currRow);

            lastRow = currRow;
        }

        return triangle;
    }
}