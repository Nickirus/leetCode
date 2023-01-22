package com.nikitov;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/">palindrome-number</a>
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
        List<Integer> valueList1 = retrieveValues(list1, new ArrayList<>());
        List<Integer> valueList2 = retrieveValues(list2, new ArrayList<>());
        valueList1.addAll(valueList2);
        return buildListNode(valueList1.stream().sorted().collect(Collectors.toList()), 0);
    }

    private List<Integer> retrieveValues(ListNode listNode, List<Integer> box) {
        if (listNode == null) {
            return box;
        }
        box.add(listNode.val);
        if (listNode.next != null) {
            return retrieveValues(listNode.next, box);
        }
        return box;
    }

    private ListNode buildListNode(List<Integer> mergedList, int index) {
        if (index < mergedList.size() && index < mergedList.size() - 1) {
            return new ListNode(mergedList.get(index), buildListNode(mergedList, ++index));
        } else if (index < mergedList.size()) {
            return new ListNode(mergedList.get(index));
        } else {
            return null;
        }
    }
}
