// Add the two numbers and return the sum as a linked list

/**
 * Definition for singly-linked list.
 *
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */

/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */

var addTwoNumbers = function (l1, l2) {
  let head = new ListNode();
  let tail = head;

  let carry = 0;

  while (l1 || l2) {
      let sum = carry;

      if (l1) {
          sum += l1.val;
          l1 = l1.next;
      }

      if (l2) {
          sum += l2.val;
          l2 = l2.next;
      }

      if (sum > 9) {
          carry = parseInt(sum / 10);
          sum = sum % 10;
      } else {
          carry = 0;
      }

      tail.next = new ListNode(sum);
      tail = tail.next;
  }

  if (carry > 0) { tail.next = new ListNode(carry); }

  return head.next;
};