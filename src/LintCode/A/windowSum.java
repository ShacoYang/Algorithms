package LintCode.A;

/**
 * Created by yanglu on 5/25/17.
 * Given an array of n integer, and a moving window(size k),
 * move the window at each iteration from the start of the array,
 * find the sum of the element inside the window at each moving.
 * For array [1,2,7,8,5], moving window size k = 3.
 1 + 2 + 7 = 10
 2 + 7 + 8 = 17
 7 + 8 + 5 = 20
 return [10,17,20]
 */
public class windowSum {
    public int[] winSum(int[] nums, int k) {
        //base case
        if (nums == null || nums.length < k || k <= 0) {
            return new int[0];
        }
        int[] sums = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            sums[0] += nums[i];
        }
        for (int i = 1; i < sums.length; i++ ) {
            sums[i] = sums[i - 1] - nums[i - 1] + nums[i + k -1];
        }
        return sums;
    }
}
