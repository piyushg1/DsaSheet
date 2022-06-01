import java.util.HashMap;

/**
 * https://leetcode.com/problems/valid-anagram/
 * 242. Valid Anagram
 * Easy
 * 
 * 4864
 * 
 * 214
 * 
 * Add to List
 * 
 * Share
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * 
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 * 
 * 
 * Follow up: What if the inputs contain Unicode characters? How would you adapt
 * your solution to such a case?
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length(), l2 = t.length();
        if (l1 != l2) {
            return false;
        }
        HashMap<Character, Integer> m1 = new HashMap<>();
        for (int i = 0; i < l1; i++) {
            m1.put(s.charAt(i), m1.getOrDefault(s.charAt(i), 0) + 1);
            m1.put(t.charAt(i), m1.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (Character c : m1.keySet()) {
            if (m1.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}
