import java.util.HashSet;

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
        // int m = matrix.length, n = matrix[0].length;
        // HashSet<Integer> r = new HashSet<>();
        // HashSet<Integer> c = new HashSet<>();

        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // if (matrix[i][j] == 0) {
        // r.add(i);
        // c.add(j);
        // }
        // }
        // }
        // // make row zeroes
        // for (int x : r) {
        // for (int i = 0; i < n; i++) {
        // matrix[x][i] = 0;
        // }
        // }

        // // make col zeroes
        // for (int i = 0; i < m; i++) {
        // for (int x : c) {
        // matrix[i][x] = 0;
        // }
        // }
        // }

        int m = matrix.length, n = matrix[0].length;
        boolean r = false, c = false;

        // check for 0th row 0s
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                r = true;
                break;
            }
        }
        // check for 0th col 0s
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                c = true;
                break;
            }
        }

        // check for rest rows and cols for zeroes and mark the first element of row and
        // col as 0
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // setting rows 0 if 1st element is 0
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // setting cols 0 if 1st element is 0
        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // now for first row and first col
        if (r) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        if (c) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
