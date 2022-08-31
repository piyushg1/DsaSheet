import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-intervals/
 * 
 * 56. Merge Intervals
 * Medium
 * 
 * 12802
 * 
 * 508
 * 
 * Add to List
 * 
 * Share
 * Given an array of intervals where intervals[i] = [starti, endi], merge all
 * overlapping intervals, and return an array of the non-overlapping intervals
 * that cover all the intervals in the input.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * Example 2:
 * 
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * 
 * 
 * Constraints:
 * 
 * 1 <= intervals.length <= 104
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 104
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        int m = intervals.length, si = 0, ei = 1;
        int[] curr_interval = new int[2];
        int[] next_interval = new int[2];

        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });
        curr_interval = intervals[0];

        for (int i = 1; i < m; i++) {
            next_interval = intervals[i];
            if (curr_interval[ei] >= next_interval[si]) {
                if (next_interval[ei] > curr_interval[ei]) {
                    curr_interval[ei] = next_interval[ei];
                    // [1,3],[2,5]
                }
            } else {
                res.add(curr_interval);
                curr_interval = next_interval;
                // [1,3],[4,5]
            }
        }
        res.add(curr_interval);

        int[][] res2 = new int[res.size()][2];
        res2 = res.toArray(res2);
        return res2;
    }
}
