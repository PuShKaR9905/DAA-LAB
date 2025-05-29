public class SmallestDivisor {
    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = Integer.MIN_VALUE;
        for (int num : nums) right = Math.max(right, num);

        while (left < right) {
            int mid = (left + right) / 2;
            int sum = 0;
            for (int num : nums)
                sum += Math.ceil((double) num / mid);
            if (sum > threshold) left = mid + 1;
            else right = mid;
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold)); // Output: 5
    }
}
