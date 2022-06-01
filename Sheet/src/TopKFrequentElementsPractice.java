import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 * 347. Top K Frequent Elements
 * Medium
 * 
 * 9125
 * 
 * 369
 * 
 * Add to List
 * 
 * Share
 * Given an integer array nums and an integer k, return the k most frequent
 * elements. You may return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * 
 * Input: nums = [1], k = 1
 * Output: [1]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 * 
 * 
 * Follow up: Your algorithm's time complexity must be better than O(n log n),
 * where n is the array's size.
 */
public class TopKFrequentElementsPractice {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        // heap=[[1,3],[2,2],[3,1]] that is if a=[1,3] and b[2,2]
        // therefore a[1]=3 and b[1]=2 and b[1]-a[1] means to check if b[1]
        // is greater than a[1] and if is then
        // put b first according to max heap property else put a.
        // by doing this we build a max heap.
        PriorityQueue<int[]> heap = new PriorityQueue<>(
                (a, b) -> (b[1] - a[1]));

        // building the frequency map
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // adding elements in the heap
        for (Integer i : map.keySet()) {
            int[] temp = new int[2];
            temp[0] = i;
            temp[1] = map.get(i);
            heap.offer(temp);
        }

        // adding elements in int array res.
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[0];
        }
        return res;
    }
}
