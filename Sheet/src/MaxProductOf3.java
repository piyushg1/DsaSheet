import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 * 
 * 628. Maximum Product of Three Numbers
 * Easy
 * 
 * 2523
 * 
 * 514
 * 
 * Add to List
 * 
 * Share
 * Given an integer array nums, find three numbers whose product is maximum and
 * return the maximum product.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3]
 * Output: 6
 * Example 2:
 * 
 * Input: nums = [1,2,3,4]
 * Output: 24
 * Example 3:
 * 
 * Input: nums = [-1,-2,-3]
 * Output: -6
 * 
 * 
 * Constraints:
 * 
 * 3 <= nums.length <= 104
 * -1000 <= nums[i] <= 1000
 */
public class MaxProductOf3 {
    public int maximumProduct(int[] nums) {
        int len = nums.length, max = 0;
        Arrays.sort(nums);
        max = Math.max(nums[0] * nums[1] * nums[len - 1], nums[len - 1] * nums[len - 2] * nums[len - 3]);
        return max;
    }
}
