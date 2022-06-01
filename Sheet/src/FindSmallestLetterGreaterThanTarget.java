/**
 * 744. Find Smallest Letter Greater Than Target
 * Easy
 * 
 * 1690
 * 
 * 1555
 * 
 * Add to List
 * 
 * Share
 * Given a characters array letters that is sorted in non-decreasing order and a
 * character target, return the smallest character in the array that is larger
 * than target.
 * 
 * Note that the letters wrap around.
 * 
 * For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 * 
 * 
 * Example 1:
 * 
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 * Example 2:
 * 
 * Input: letters = ["c","f","j"], target = "c"
 * Output: "f"
 * Example 3:
 * 
 * Input: letters = ["c","f","j"], target = "d"
 * Output: "f"
 * 
 * 
 * Constraints:
 * 
 * 2 <= letters.length <= 104
 * letters[i] is a lowercase English letter.
 * letters is sorted in non-decreasing order.
 * letters contains at least two different characters.
 * target is a lowercase English letter.
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0, len = letters.length, hi = len - 1, mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (target < letters[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return letters[lo % len];
    }
}
