public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose
        for (int i = 0; i < n; ++i)
            for (int j = i; j < n; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        // Reverse rows
        for (int[] row : matrix)
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        rotate(matrix);
        for (int[] row : matrix)
            System.out.println(java.util.Arrays.toString(row)); // Output: [3, 1], [4, 2]
    }
}
