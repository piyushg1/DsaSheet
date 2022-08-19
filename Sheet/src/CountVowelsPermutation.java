import java.util.HashMap;

// https://leetcode.com/problems/count-vowels-permutation/
public class CountVowelsPermutation {
    /**
     * 1220. Count Vowels Permutation
     * Hard
     * 
     * 1224
     * 
     * 106
     * 
     * Add to List
     * 
     * Share
     * Given an integer n, your task is to count how many strings of length n can be
     * formed under the following rules:
     * 
     * Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
     * Each vowel 'a' may only be followed by an 'e'.
     * Each vowel 'e' may only be followed by an 'a' or an 'i'.
     * Each vowel 'i' may not be followed by another 'i'.
     * Each vowel 'o' may only be followed by an 'i' or a 'u'.
     * Each vowel 'u' may only be followed by an 'a'.
     * Since the answer may be too large, return it modulo 10^9 + 7.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: n = 1
     * Output: 5
     * Explanation: All possible strings are: "a", "e", "i" , "o" and "u".
     * Example 2:
     * 
     * Input: n = 2
     * Output: 10
     * Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie", "io",
     * "iu", "oi", "ou" and "ua".
     * Example 3:
     * 
     * Input: n = 5
     * Output: 68
     * 
     * 
     * Constraints:
     * 
     * 1 <= n <= 2 * 10^4
     * 
     * @param n
     * @return modulo 10^9 + 7.
     */
    public int countVowelPermutation(int n) {
        HashMap<String, Long> map = new HashMap<>();
        int mod = 1000000007;
        long total = 0;
        char[] charSet = { 'a', 'e', 'i', 'o', 'u' };

        for (char c : charSet) {
            total += helper(n - 1, c, map, mod) % mod;
        }
        return (int) total;
    }

    public long helper(int rem, char prevChar, HashMap<String, Long> map, int mod) {
        if (rem == 0) {
            return 1;
        }
        String key = "" + rem + prevChar;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        long total = 0;

        switch (prevChar) {
            case 'a': {
                total = helper(rem - 1, 'e', map, mod) % mod;
                break;
            }
            case 'e': {
                total = (helper(rem - 1, 'a', map, mod) + helper(rem - 1, 'a', map, mod)) % mod;
                break;
            }
            case 'i': {
                total = (helper(rem - 1, 'a', map, mod) +
                        helper(rem - 1, 'e', map, mod) +
                        helper(rem - 1, 'o', map, mod) +
                        helper(rem - 1, 'u', map, mod)) % mod;
                break;
            }
            case 'o': {
                total = helper(rem - 1, 'u', map, mod) % mod;
                break;
            }
            case 'u': {
                total = helper(rem - 1, 'a', map, mod) % mod;
                break;
            }
        }
        map.put(key, total);
        return total;
    }
}
