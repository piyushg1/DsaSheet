/**
 * https://leetcode.com/problems/game-of-life/
 * 289. Game of Life
 * Medium
 * 
 * 4137
 * 
 * 411
 * 
 * Add to List
 * 
 * Share
 * According to Wikipedia's article: "The Game of Life, also known simply as
 * Life, is a cellular automaton devised by the British mathematician John
 * Horton Conway in 1970."
 * 
 * The board is made up of an m x n grid of cells, where each cell has an
 * initial state: live (represented by a 1) or dead (represented by a 0). Each
 * cell interacts with its eight neighbors (horizontal, vertical, diagonal)
 * using the following four rules (taken from the above Wikipedia article):
 * 
 * Any live cell with fewer than two live neighbors dies as if caused by
 * under-population.
 * Any live cell with two or three live neighbors lives on to the next
 * generation.
 * Any live cell with more than three live neighbors dies, as if by
 * over-population.
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by
 * reproduction.
 * The next state is created by applying the above rules simultaneously to every
 * cell in the current state, where births and deaths occur simultaneously.
 * Given the current state of the m x n grid board, return the next state.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
 * Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
 * Example 2:
 * 
 * 
 * Input: board = [[1,1],[1,0]]
 * Output: [[1,1],[1,1]]
 * 
 * 
 * Constraints:
 * 
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 25
 * board[i][j] is 0 or 1.
 * 
 * 
 * Follow up:
 * 
 * Could you solve it in-place? Remember that the board needs to be updated
 * simultaneously: You cannot update some cells first and then use their updated
 * values to update other cells.
 * In this question, we represent the board using a 2D array. In principle, the
 * board is infinite, which would cause problems when the active area encroaches
 * upon the border of the array (i.e., live cells reach the border). How would
 * you address these problems?
 */
// TODO: do it by yourself.
public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int countLive = 0;
                for (int p = Math.max(i - 1, 0); p < Math.min(i + 2, m); p++) {
                    for (int q = Math.max(j - 1, 0); q < Math.min(j + 2, n); q++) {
                        if (board[p][q] == 2 || board[p][q] == 1)
                            countLive++;// count status 0 is live
                    }
                }
                countLive -= board[i][j];
                if (board[i][j] == 0 && countLive == 3)
                    board[i][j] = 3; // status 0 is dead,next status is live
                if (board[i][j] == 1 && (countLive < 2 || countLive > 3))
                    board[i][j] = 2; // status 0 is live,next status is dead

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] %= 2;
            }
        }
    }
}
