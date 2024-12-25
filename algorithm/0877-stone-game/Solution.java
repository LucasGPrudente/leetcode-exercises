class Solution {

    // Return true if Alice wins the game, or false if Bob wins
    public boolean stoneGame(int[] piles) {
        int alice = 0;
        int bob = 0;

        int i = 0;
        int j = piles.length - 1;

        while (i < j) {
            if (piles[i] > piles[j]) {
                alice += piles[i];
                bob += piles[j];
            } else {
                bob += piles[i];
                alice += piles[j];
            }

            i++;
            j--;
        }

        return alice > bob;
    }
}