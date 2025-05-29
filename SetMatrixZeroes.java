import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix[0].length; ++j)
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }

        for (int i : rows)
            for (int j = 0; j < matrix[0].length; ++j)
                matrix[i][j] = 0;

        for (int j : cols)
            for (int i = 0; i < matrix.length; ++i)
                matrix[i][j] = 0;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };
        setZeroes(matrix);
        for (int[] row : matrix)
            System.out.println(java.util.Arrays.toString(row));
    }
}
