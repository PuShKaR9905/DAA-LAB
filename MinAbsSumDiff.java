import java.util.*;

public class MinAbsSumDiff {
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums1) set.add(num);

        int mod = 1_000_000_007;
        int totalDiff = 0, maxGain = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            totalDiff = (totalDiff + diff) % mod;

            Integer ceil = set.ceiling(nums2[i]);
            Integer floor = set.floor(nums2[i]);

            if (ceil != null) maxGain = Math.max(maxGain, diff - Math.abs(ceil - nums2[i]));
            if (floor != null) maxGain = Math.max(maxGain, diff - Math.abs(floor - nums2[i]));
        }

        return (totalDiff - maxGain + mod) % mod;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 5}, nums2 = {2, 3, 5};
        System.out.println(minAbsoluteSumDiff(nums1, nums2)); // Output: 3
    }
}
