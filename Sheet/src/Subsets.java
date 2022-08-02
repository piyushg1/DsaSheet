import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 */
public class Subsets {
    /**
     * Given an integer array nums of unique elements, return all possible subsets
     * (the power set).
     * 
     * The solution set must not contain duplicate subsets. Return the solution in
     * any order.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3]
     * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     * Example 2:
     * 
     * Input: nums = [0]
     * Output: [[],[0]]
     * 
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 10
     * -10 <= nums[i] <= 10
     * All the numbers of nums are unique.
     * 
     * @param nums integer array
     * @return solution
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < 1 << len; ++i) {
            List<Integer> l = new ArrayList<>();

            for (int j = 0; j < len; ++j) {
                if (((i >> j) & 1) == 1) {
                    // this means the bit is set
                    // therefore add it to l
                    l.add(nums[j]);
                }
            }
            res.add(l);
        }
        return res;
    }
}
