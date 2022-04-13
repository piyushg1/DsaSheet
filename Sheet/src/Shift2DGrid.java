import java.util.*;

/**
 * 
 * https://leetcode.com/problems/shift-2d-grid/
 * 
 * 1260. Shift 2D Grid
 * Easy
 * 
 * 639
 * 
 * 179
 * 
 * Add to List
 * 
 * Share
 * Given a 2D grid of size m x n and an integer k. You need to shift the grid k
 * times.
 * 
 * In one shift operation:
 * 
 * Element at grid[i][j] moves to grid[i][j + 1].
 * Element at grid[i][n - 1] moves to grid[i + 1][0].
 * Element at grid[m - 1][n - 1] moves to grid[0][0].
 * Return the 2D grid after applying shift operation k times.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
 * Output: [[9,1,2],[3,4,5],[6,7,8]]
 * Example 2:
 * 
 * 
 * Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
 * Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
 * Example 3:
 * 
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
 * Output: [[1,2,3],[4,5,6],[7,8,9]]
 * 
 * 
 * Constraints:
 * 
 * m == grid.length
 * n == grid[i].length
 * 1 <= m <= 50
 * 1 <= n <= 50
 * -1000 <= grid[i][j] <= 1000
 * 0 <= k <= 100
 */
public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int m = grid.length, n = grid[0].length, total = m * n;
        for (int i = 0; i < m; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int index = findShiftedIndex(i, j, n, k, total);
                subList.add(grid[index / n][index % n]);
            }
            list.add(subList);
        }
        return list;
    }

    public int findShiftedIndex(int i, int j, int col, int k, int total) {
        int index = (i * col + j + total - k) % total;
        return index;
    }
}
