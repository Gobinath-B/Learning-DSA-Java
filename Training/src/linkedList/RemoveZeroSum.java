package linkedList;

import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveZeroSum {
    public ListNode removeZeroSumSublists(ListNode head) {
        if (head == null)
            return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int sum = 0;

        ListNode current = dummy;
        while (current != null) {
            sum += current.val;
            if (map.containsKey(sum)) {
                // Skip sublist with zero sum
                current = map.get(sum).next;
                int tempSum = sum + current.val;
                while (tempSum != sum) {
                    // Remove nodes between map.get(sum) and current from map
                    map.remove(tempSum);
                    current = current.next;
                    tempSum += current.val;
                }
                map.get(sum).next = current.next;
            } else {
                map.put(sum, current);
            }
            current = current.next;
        }

        return dummy.next;
    }
}
