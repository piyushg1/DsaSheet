/**
 * https://leetcode.com/problems/valid-perfect-square/
 * 
 * 367. Valid Perfect Square
 * Easy
 * 
 * 2160
 * 
 * 229
 * 
 * Add to List
 * 
 * Share
 * Given a positive integer num, write a function which returns True if num is a
 * perfect square else False.
 * 
 * Follow up: Do not use any built-in library function such as sqrt.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: num = 16
 * Output: true
 * Example 2:
 * 
 * Input: num = 14
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= num <= 2^31 - 1
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }

        long lo = 1, hi = num;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long t = mid * mid;
            if (t > num) {
                hi = mid - 1;
            } else if (t < num) {
                lo = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
