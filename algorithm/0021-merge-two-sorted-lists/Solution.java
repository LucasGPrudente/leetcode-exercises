class Solution {

    // Merge the two lists into one sorted list
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode header = new ListNode();
        ListNode tail = header;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        return header.next;
    }
}