// Delete all duplicates. Return the linked list sorted as well

/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */

var deleteDuplicates = function (head) {
  if (!head) { return head; }

  let header = new ListNode(head.val - 1);
  let tail = header;

  while (head) {
      if (head.val != tail.val) {
          tail.next = head;
          tail = tail.next;
      }

      head = head.next;
  }

  tail.next = null;

  return header.next;
};