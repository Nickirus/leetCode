package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/">reverse-linked-list</a>
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        var executor = new ReverseLinkedListSolution();
        System.out.println(
                executor.reverseList(new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5)))))));//5,4,3,2,1
    }
}

//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

class ReverseLinkedListSolution {
    public ListNode reverseList(ListNode head) {
            return reverseList(head, null);
    }

    public ListNode reverseList(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        } else {
            ListNode next = head.next;
            head.next = newHead;
            return reverseList(next, head);
        }
    }
}
