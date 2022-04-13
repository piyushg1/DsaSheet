/**
 * https://leetcode.com/problems/spiral-matrix-ii/
 * 59. Spiral Matrix II
 * Medium
 * 
 * 2778
 * 
 * 167
 * 
 * Add to List
 * 
 * Share
 * Given a positive integer n, generate an n x n matrix filled with elements
 * from 1 to n2 in spiral order.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 3
 * Output: [[1,2,3],[8,9,4],[7,6,5]]
 * Example 2:
 * 
 * Input: n = 1
 * Output: [[1]]
 * 
 * 
 * Constraints:
 * 
 * 1 <= n <= 20
 */
public class SpiralMatrix2 {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if (n == 0) {
            return res;
        }
        int count = 1, rowBegin = 0, rowEnd = n - 1, colBegin = 0, colEnd = n - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // left to right
            for (int i = colBegin; i <= colEnd; i++) {
                res[rowBegin][i] = count++;
            }
            rowBegin++;
            // top to bottom
            for (int i = rowBegin; i <= rowEnd; i++) {
                res[i][colEnd] = count++;
            }
            colEnd--;
            // right to left
            for (int i = colEnd; i >= colBegin; i--) {
                res[rowEnd][i] = count++;
            }
            rowEnd--;
            // bottom to top
            for (int i = rowEnd; i >= rowBegin; i--) {
                res[i][colBegin] = count++;
            }
            colBegin++;
        }
        return res;
    }
}
