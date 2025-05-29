public class SqrtBinarySearch {
    public static int sqrt(int x) {
        if (x == 0 || x == 1) return x;
        int start = 1, end = x, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(25)); // Output: 5
    }
}
