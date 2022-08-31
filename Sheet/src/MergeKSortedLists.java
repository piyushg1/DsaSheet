import java.util.PriorityQueue;

import javafx.scene.layout.Priority;

public class MergeKSortedLists {
    /**
     * 23. Merge k Sorted Lists
     * Hard
     * 
     * 13855
     * 
     * 525
     * 
     * Add to List
     * 
     * Share
     * You are given an array of k linked-lists lists, each linked-list is sorted in
     * ascending order.
     * 
     * Merge all the linked-lists into one sorted linked-list and return it.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: lists = [[1,4,5],[1,3,4],[2,6]]
     * Output: [1,1,2,3,4,4,5,6]
     * Explanation: The linked-lists are:
     * [
     * 1->4->5,
     * 1->3->4,
     * 2->6
     * ]
     * merging them into one sorted list:
     * 1->1->2->3->4->4->5->6
     * Example 2:
     * 
     * Input: lists = []
     * Output: []
     * Example 3:
     * 
     * Input: lists = [[]]
     * Output: []
     * 
     * 
     * Constraints:
     * 
     * k == lists.length
     * 0 <= k <= 104
     * 0 <= lists[i].length <= 500
     * -104 <= lists[i][j] <= 104
     * lists[i] is sorted in ascending order.
     * The sum of lists[i].length will not exceed 104.
     * 
     * @param lists list of lists
     * @return merged head
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode root = new ListNode();
        PriorityQueue<Integer> heap = new PriorityQueue<>();// min heap by default

        for (ListNode x : lists) {
            while (x != null) {
                heap.offer(x.val);
                x = x.next;
            }
        }
        if (heap.isEmpty()) {
            return null;
        }
        root = new ListNode(heap.poll());
        ListNode temp = root;

        while (!heap.isEmpty()) {
            temp.next = new ListNode(heap.poll());
            temp = temp.next;
        }
        return root;
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