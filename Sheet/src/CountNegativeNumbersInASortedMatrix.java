/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * Count Negative Numbers in a Sorted Matrix
 * Easy
 * 
 * 2270
 * 
 * 75
 * 
 * Add to List
 * 
 * Share
 * Given a m x n matrix grid which is sorted in non-increasing order both
 * row-wise and column-wise, return the number of negative numbers in grid.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 * Output: 8
 * Explanation: There are 8 negatives number in the matrix.
 * Example 2:
 * 
 * Input: grid = [[3,2],[1,0]]
 * Output: 0
 * 
 * 
 * Constraints:
 * 
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 100
 * -100 <= grid[i][j] <= 100
 * 
 * 
 * Follow up: Could you find an O(n + m) solution?
 */
public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] g : grid) {
            count += sendNegatives(g);
        }
        return count;
    }

    public int sendNegatives(int[] g) {
        int i;
        for (i = 0; i < g.length; i++) {
            if (g[i] < 0) {
                break;
            }
        }
        return g.length - i;
    }
}
