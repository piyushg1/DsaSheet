/**
 * https://leetcode.com/problems/next-greater-element-iii/
 * 556. Next Greater Element III
 * Medium
 * 
 * 2037
 * 
 * 327
 * 
 * Add to List
 * 
 * Share
 * Given a positive integer n, find the smallest integer which has exactly the
 * same digits existing in the integer n and is greater in value than n. If no
 * such positive integer exists, return -1.
 * 
 * Note that the returned integer should fit in 32-bit integer, if there is a
 * valid answer but it does not fit in 32-bit integer, return -1.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: n = 12
 * Output: 21
 * Example 2:
 * 
 * Input: n = 21
 * Output: -1
 * 
 * 
 * Constraints:
 * 
 * 1 <= n <= 231 - 1
 */
public class NextGreater3 {
    public int nextGreaterElement(int n) {
        char[] arr = ("" + n).toCharArray();
        int len = arr.length;
        int i = len - 2;
        while (i >= 0 && arr[i + 1] <= arr[i]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = len - 1;
        while (j >= 0 && arr[j] <= arr[i]) {
            j--;
        }
        // swap jth and ith
        swap(arr, i, j);
        reverse(arr, i + 1, j);
        try {
            return Integer.parseInt(new String(arr));
        } catch (Exception e) {
            // TODO: handle exception
            return -1;
        }
    }

    public void swap(char[] a, int start, int end) {
        char temp = a[end];
        a[end] = a[start];
        a[start] = temp;
    }

    public void reverse(char[] a, int start, int end) {
        while (start < end) {
            swap(a, start, end);
            start++;
            end--;
        }
    }
}
