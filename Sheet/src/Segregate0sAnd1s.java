public class Segregate0sAnd1s {
    void segregate0and1(int[] arr, int n) {
        // code here
        int j = 0, k = n - 1;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[j] = 0;
                j++;
            } else {
                arr[k] = 1;
                k--;
            }
        }
        for (int i : res) {
            System.out.println(i);
        }
    }
}
