import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// https://leetcode.com/problems/3sum/
public class ThreeSum {
    /**
     * 15. 3Sum
     * Medium
     * 
     * 20137
     * 
     * 1903
     * 
     * Add to List
     * 
     * Share
     * Given an integer array nums, return all the triplets [nums[i], nums[j],
     * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
     * nums[k] == 0.
     * 
     * Notice that the solution set must not contain duplicate triplets.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     * Explanation:
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     * The distinct triplets are [-1,0,1] and [-1,-1,2].
     * Notice that the order of the output and the order of the triplets does not
     * matter.
     * Example 2:
     * 
     * Input: nums = [0,1,1]
     * Output: []
     * Explanation: The only possible triplet does not sum up to 0.
     * Example 3:
     * 
     * Input: nums = [0,0,0]
     * Output: [[0,0,0]]
     * Explanation: The only possible triplet sums up to 0.
     * 
     * 
     * Constraints:
     * 
     * 3 <= nums.length <= 3000
     * -105 <= nums[i] <= 105
     * 
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length, i = 0, target = 0;

        if (len >= 3) {
            HashSet<Integer> set = new HashSet<>();
            for (int x : nums) {
                set.add(x);
            }

            List<Integer> list = new ArrayList<>();
            while (list.size() < 2) {
                target = 0 - nums[i];
                if (set.contains(target)) {
                    list.add(target);
                }
            }
        }
        return res;
    }
}
