import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 * 
 * 14. Longest Common Prefix
 * Easy
 * 
 * 7438
 * 
 * 2896
 * 
 * Add to List
 * 
 * Share
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * 
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Constraints:
 * 
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (strs == null || len == 0) {
            return "";
        }
        Arrays.sort(strs);
        int i = 0;
        String first = strs[0];
        String last = strs[len - 1];
        while (i < first.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        if (i == 0) {
            return "";
        } else {
            return first.substring(0, i);
        }
    }
}
