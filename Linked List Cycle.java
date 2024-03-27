/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        ListNode slow = head;
        ListNode fast = head.next;

        // Move slow and fast pointers until they meet (or until fast reaches the end)
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No cycle detected
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        // Creating a cycle: tail connects to the second node
        head.next.next.next.next = head.next;

        boolean hasCycle = solution.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}