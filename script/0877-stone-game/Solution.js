// Return true if Alice wins the game, or false if Bob wins

/**
 * @param {number[]} piles
 * @return {boolean}
 */

var stoneGame = function (piles) {
  let alice = 0;
  let bob = 0;

  for (let i = 0, j = piles.length - 1; i < j; i++, j--) {
      if (piles[i] > piles[j]) {
          alice += piles[i];
          bob += piles[j];
      } else {
          bob += piles[i];
          alice += piles[j];
      }
  }

  return alice > bob;
};