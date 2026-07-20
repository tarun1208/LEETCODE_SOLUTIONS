// Last updated: 7/20/2026, 10:34:18 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13        if (head == null || head.next == null) {
14            return head;
15        }
16        
17        ListNode current = head;
18        
19        while (current != null && current.next != null) {
20            if (current.val == current.next.val) {
21                current.next = current.next.next;
22            } else {
23                current = current.next;
24            }
25        }
26        
27        return head;
28    }
29}