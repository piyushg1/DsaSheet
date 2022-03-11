
/**
 * https://leetcode.com/problems/majority-element/
 * 169. Majority Element
Easy

8974

323

Add to List

Share
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        // naive approach would be to write two loops.
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = nums.length;
        int ret = -1;
        for (int i : nums) {
            if (!hm.containsKey(i)) {
                hm.put(i, 1);
            } else {
                hm.put(i, hm.get(i) + 1);
            }
            if (hm.get(i) > len / 2) {
                ret = i;
                break;
            }
        }
        return ret;
    }
}
