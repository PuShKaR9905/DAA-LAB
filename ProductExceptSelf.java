import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 1, right = 1;

        Arrays.fill(result, 1);

        for (int i = 0; i < n; i++) {
            result[i] *= left;
            left *= nums[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums))); // Output: [24, 12, 8, 6]
    }
}
