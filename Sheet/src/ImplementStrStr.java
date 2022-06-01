/**
 * https://leetcode.com/problems/implement-strstr/
 * 28. Implement strStr()
 * Easy
 * 
 * 3967
 * 
 * 3640
 * 
 * Add to List
 * 
 * Share
 * Implement strStr().
 * 
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * Clarification:
 * 
 * What should we return when needle is an empty string? This is a great
 * question to ask during an interview.
 * 
 * For the purpose of this problem, we will return 0 when needle is an empty
 * string. This is consistent to C's strstr() and Java's indexOf().
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * 
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * 
 * 
 * Constraints:
 * 
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        int res = -1;
        if (len2 == 0) {
            return 0;
        }
        if (len1 >= len2) {
            for (int i = 0; i <= len1 - len2; i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    res = check(haystack.substring(i, len1), needle.substring(0, len2), len2);
                    if (res == 1) {
                        res = i;
                        break;
                    }
                }
            }
        }
        return res;
    }

    public int check(String h, String n, int len) {
        for (int i = 0; i < len; i++) {
            if (h.charAt(i) != n.charAt(i)) {
                return -1;
            }
        }
        return 1;
    }
}
