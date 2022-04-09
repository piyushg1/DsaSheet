import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 * 
 * 347. Top K Frequent Elements
 * Medium
 * 
 * 8114
 * 
 * 347
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

/**
 * the first approach that i can think of would be to make a hashmap then count
 * the frequency
 * then use a Minheap and enter the k elements based on the frequency of the
 * element
 * then use a array to store the result and then return the result
 * this approch is good but it takes O(nlogn) time.
 * 
 * i can improve it by using the bucket sort approach in which i will use the
 * array which has the frequency and enter elements like a node
 * so if 3 elements have afreq of 2 then @ index 2 we will input 3 elements like
 * hash collision
 * 
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            // stores the frequency in the hashtable
        }
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] res = new int[k];
        int count = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size(); j++) {
                    res[count++] = bucket[i].get(j);
                }
                if (count == k) {
                    break;
                }
            }
        }
        return res;
    }
}
