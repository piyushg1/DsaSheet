
/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 * 
 * 680. Valid Palindrome II
 * Easy
 * 
 * 4746
 * 
 * 270
 * 
 * Add to List
 * 
 * Share
 * Given a string s, return true if the s can be palindrome after deleting at
 * most one character from it.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "aba"
 * Output: true
 * Example 2:
 * 
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * Example 3:
 * 
 * Input: s = "abc"
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 */
public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {
        int len = s.length(), lo = 0, hi = len - 1;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return (isPal(s, lo + 1, hi) || isPal(s, lo, hi - 1));
            }
            lo++;
            hi--;
        }
        return true;
    }

    public boolean isPal(String s, int lo, int hi) {
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
}
