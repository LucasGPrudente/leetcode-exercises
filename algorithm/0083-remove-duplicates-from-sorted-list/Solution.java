class Solution {

    // Delete all duplicates. Return the linked list sorted as well
    public ListNode deleteDuplicates(ListNode head) {
        ListNode header = head;

        while (head != null) {
            ListNode temp = head;

            while (temp != null && temp.val == head.val) {
                temp = temp.next;
            }

            head.next = temp;
            head = head.next;
        }

        return header;
    }
}