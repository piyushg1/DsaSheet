import java.util.HashMap;

/**
 * https://leetcode.com/problems/encode-and-decode-tinyurl/
 * 
 * 535. Encode and Decode TinyURL
 * Medium
 * 
 * 1261
 * 
 * 2419
 * 
 * Add to List
 * 
 * Share
 * Note: This is a companion problem to the System Design problem: Design
 * TinyURL.
 * TinyURL is a URL shortening service where you enter a URL such as
 * https://leetcode.com/problems/design-tinyurl and it returns a short URL such
 * as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a
 * tiny URL.
 * 
 * There is no restriction on how your encode/decode algorithm should work. You
 * just need to ensure that a URL can be encoded to a tiny URL and the tiny URL
 * can be decoded to the original URL.
 * 
 * Implement the Solution class:
 * 
 * Solution() Initializes the object of the system.
 * String encode(String longUrl) Returns a tiny URL for the given longUrl.
 * String decode(String shortUrl) Returns the original long URL for the given
 * shortUrl. It is guaranteed that the given shortUrl was encoded by the same
 * object.
 * 
 * 
 * Example 1:
 * 
 * Input: url = "https://leetcode.com/problems/design-tinyurl"
 * Output: "https://leetcode.com/problems/design-tinyurl"
 * 
 * Explanation:
 * Solution obj = new Solution();
 * string tiny = obj.encode(url); // returns the encoded tiny url.
 * string ans = obj.decode(tiny); // returns the original url after deconding
 * it.
 * 
 * 
 * Constraints:
 * 
 * 1 <= url.length <= 104
 * url is guranteed to be a valid URL.
 */
public class EncodeAndDecodeTinyUrl {
    // Encodes a URL to a shortened URL.
    HashMap<String, String> codeDB = new HashMap<>();
    HashMap<String, String> urlDB = new HashMap<>();
    static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private String getCode() {
        char[] code = new char[6];
        for (int i = 0; i < 6; i++) {
            code[i] = chars.charAt((int) Math.random() * 62);
        }
        return "http://tinyurl.com" + String.valueOf(code);
    }

    public String encode(String longUrl) {
        if (urlDB.containsKey(longUrl)) {
            return urlDB.get(longUrl);
        }
        String code = getCode();
        while (codeDB.containsKey(code)) {
            code = getCode();
        }
        codeDB.put(code, longUrl);
        urlDB.put(longUrl, code);
        return code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return codeDB.get(shortUrl);
    }
}
