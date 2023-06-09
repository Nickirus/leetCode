package com.nikitov;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/linked-list-cycle/">linked-list-cycle</a>
 */
public class LinkedListCycle {
    public static void main(String[] args) {
        var executor = new LinkedListCycleSolution();
        ListNode node5 = new ListNode(5);
        ListNode node2 = new ListNode(2,
                new ListNode(3,
                        new ListNode(4,
                                node5)));
        System.out.println(executor.hasCycle1(new ListNode(1,
                node2)));//false
        node5.next = node2;
        System.out.println(executor.hasCycle1(new ListNode(1,
                node2)));//true
    }
}

class LinkedListCycleSolution {
    public boolean hasCycle(ListNode head) {
        return head != null && hasCycle(head, new HashSet<>());
    }

    private boolean hasCycle(ListNode head, Set<ListNode> handledNodes) {
        if (handledNodes.contains(head)) {
            return true;
        } else {
            handledNodes.add(head);
            if (head.next != null) {
                return hasCycle(head.next, handledNodes);
            } else {
                return false;
            }
        }
    }

    //    O(1) (i.e. constant) memory
    public boolean hasCycle1(ListNode head) {
        ListNode oneStep = head;
        ListNode twoStep = head;
        while(twoStep != null && twoStep.next != null) {
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;

            if(oneStep.equals(twoStep)) {
                return true;
            }
        }
        return false;
    }
}
