/**
 * https://leetcode.com/problems/rotate-array/
 * 189. Rotate Array
 * Medium
 * 
 * 8673
 * 
 * 1233
 * 
 * Add to List
 * 
 * Share
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * 
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 * 
 * 
 * Follow up:
 * 
 * Try to come up with as many solutions as you can. There are at least three
 * different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
/**
 * Approach->
 * reverse the whole array
 * then reverse the first k elements
 * then reverse the last n-k elements (n=no. of elements)
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len; // len=7 and k=3 if k were 8 then it should only had to be rotated 1 time
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}
