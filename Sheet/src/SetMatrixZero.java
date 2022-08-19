import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZero {
    /**
     * Set Matrix Zeroes
     * Medium
     * 
     * 8643
     * 
     * 537
     * 
     * Add to List
     * 
     * Share
     * Given an m x n integer matrix matrix, if an element is 0, set its entire row
     * and column to 0's.
     * 
     * You must do it in place.
     * 
     * 
     * 
     * Example 1:
     * 
     * 
     * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: [[1,0,1],[0,0,0],[1,0,1]]
     * Example 2:
     * 
     * 
     * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
     * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
     * 
     * 
     * Constraints:
     * 
     * m == matrix.length
     * n == matrix[0].length
     * 1 <= m, n <= 200
     * -231 <= matrix[i][j] <= 231 - 1
     * 
     * 
     * Follow up:
     * 
     * A straightforward solution using O(mn) space is probably a bad idea.
     * A simple improvement uses O(m + n) space, but still not the best solution.
     * Could you devise a constant space solution?
     * 
     * @param matrix m x n integer matrix
     */
    public void setZeroes(int[][] matrix) {
        // SC: O(m+n), TC: O(m*n)
        int m = matrix.length, n = matrix[0].length;
        HashSet<Integer> r = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    r.add(i);
                    c.add(j);
                }
            }
        }
        // make row zeroes
        for (int x : r) {
            for (int i = 0; i < n; i++) {
                matrix[x][i] = 0;
            }
        }

        // make col zeroes
        for (int i = 0; i < m; i++) {
            for (int x : c) {
                matrix[i][x] = 0;
            }
        }
    }
}
