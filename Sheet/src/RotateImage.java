public class RotateImage {
    public void rotate(int[][] matrix) {
        // step 1 -> transpose the matrix
        int n = matrix.length, i, j, temp;

        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // step 2 -> reverse the rows
        for (i = 0; i < n; i++) {
            rev(matrix[i]);
        }
    }

    public void rev(int[] arr) {
        int p = 0, q = arr.length - 1, t;

        while (p < q) {
            t = arr[p];
            arr[p] = arr[q];
            arr[q] = t;
            p++;
            q--;
        }
    }
}
