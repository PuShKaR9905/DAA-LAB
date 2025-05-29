import java.util.*;

public class MergeSortedArrays {
    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            result[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        }

        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        System.out.println(Arrays.toString(merge(a, b))); // Output: [1, 2, 3, 4, 5, 6]
    }
}
