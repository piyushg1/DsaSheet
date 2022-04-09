import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/last-stone-weight/
 * 
 * 1046. Last Stone Weight
 * Easy
 * 
 * 2721
 * 
 * 57
 * 
 * Add to List
 * 
 * Share
 * You are given an array of integers stones where stones[i] is the weight of
 * the ith stone.
 * 
 * We are playing a game with the stones. On each turn, we choose the heaviest
 * two stones and smash them together. Suppose the heaviest two stones have
 * weights x and y with x <= y. The result of this smash is:
 * 
 * If x == y, both stones are destroyed, and
 * If x != y, the stone of weight x is destroyed, and the stone of weight y has
 * new weight y - x.
 * At the end of the game, there is at most one stone left.
 * 
 * Return the smallest possible weight of the left stone. If there are no stones
 * left, return 0.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: stones = [2,7,4,1,8,1]
 * Output: 1
 * Explanation:
 * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 * we combine 1 and 1 to get 0 so the array converts to [1] then that's the
 * value of the last stone.
 * Example 2:
 * 
 * Input: stones = [1]
 * Output: 1
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // for max heap because by default it is min heap.
        int first, sec;
        for (int stone : stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            first = pq.poll();
            sec = pq.poll();
            if (first != sec) {
                pq.add(Math.abs(first - sec));
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
