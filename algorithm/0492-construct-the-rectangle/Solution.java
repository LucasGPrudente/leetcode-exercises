class Solution {

    // Return an array [L, W] where L and W are the length and width of the web page
    public int[] constructRectangle(int area) {
        int sqrt = (int) Math.sqrt(area);

        if (sqrt * sqrt == area) { return new int[] { sqrt, sqrt }; }

        int[] dim = new int[] { area, 1 };

        for (int w = 2; w <= sqrt; w++) {
            if (area % w == 0) {
                int l = area / w;

                if (l - w < dim[0] - dim[1]) {
                    dim[0] = l;
                    dim[1] = w;
                }
            }
        }

        return dim;
    }
}