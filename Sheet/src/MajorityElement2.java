import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/majority-element-ii/
 * 229. Majority Element II
 * Medium
 * 
 * 4480
 * 
 * 270
 * 
 * Add to List
 * 
 * Share
 * Given an integer array of size n, find all elements that appear more than ⌊
 * n/3 ⌋ times.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,3]
 * Output: [3]
 * Example 2:
 * 
 * Input: nums = [1]
 * Output: [1]
 * Example 3:
 * 
 * Input: nums = [1,2]
 * Output: [1,2]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 5 * 104
 * -109 <= nums[i] <= 109
 * 
 * 
 * Follow up: Could you solve the problem in linear time and in O(1) space?
 */
public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = nums.length;
        for (int i : nums) {
            hm.put(i, (hm.getOrDefault(i, 0) + 1));
            if (hm.get(i) > len / 3 && !arr.contains(i)) {
                arr.add(i);
            }
        }
        return arr;
    }
}
