import java.util.*;

public class DivideIntoEqualPairs {
    public static boolean canDivide(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for (int count : map.values()) {
            if (count % 2 != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 3, 3};
        System.out.println(canDivide(nums)); // Output: true
    }
}
