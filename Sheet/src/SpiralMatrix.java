import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/
 * 54. Spiral Matrix
 * Medium
 * 
 * 6826
 * 
 * 819
 * 
 * Add to List
 * 
 * Share
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 * 
 * 
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * 
 * Constraints:
 * 
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10
 * -100 <= matrix[i][j] <= 100
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length, rb = 0, cb = 0, re = m - 1, ce = n - 1;
        while (rb <= re && cb <= ce) {
            // left to right
            for (int i = cb; i <= ce && list.size() < n * m; i++) {
                list.add(matrix[rb][i]);
            }
            rb++;
            // top to down
            for (int i = rb; i <= re && list.size() < n * m; i++) {
                list.add(matrix[i][ce]);
            }
            ce--;
            // right to left
            for (int i = ce; i >= cb && list.size() < n * m; i--) {
                list.add(matrix[re][i]);
            }
            re--;
            // down to top
            for (int i = re; i >= rb && list.size() < n * m; i--) {
                list.add(matrix[i][cb]);
            }
            cb++;
        }
        return list;
    }
}
