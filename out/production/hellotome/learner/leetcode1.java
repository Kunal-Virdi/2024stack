package learner;

import java.util.Arrays;

public class leetcode1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sum()));
        sum();
    }
    public static int[] sum() {
        int[] nums = {2, 4, 5, 3, 6, 7, 1};
        int target = 7;
        int n = nums.length;
        int[] r = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    r = new int[]{i, j};
                }
            }

        }
        return r;
    }
}
