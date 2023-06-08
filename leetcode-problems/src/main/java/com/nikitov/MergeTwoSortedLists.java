package com.nikitov;

/**
 * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/">merge-two-sorted-lists</a>
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        var executor = new MergeTwoSortedListsSolution();
        ListNode resultNodes = executor.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4))));
        System.out.println(resultNodes);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

class MergeTwoSortedListsSolution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            } else {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }
        } else {
            return list1 == null ? list2 : list1;
        }
    }
}
