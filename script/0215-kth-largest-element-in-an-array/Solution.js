// Return the kth largest element in the array.

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */

var findKthLargest = function (nums, k) {
  let pq = new MaxPriorityQueue({ compare: (a, b) => b - a });

  for (let num of nums) {
      pq.enqueue(num);
  }

  while (k > 1) {
      pq.dequeue();
      k--;
  }

  return pq.dequeue();
};