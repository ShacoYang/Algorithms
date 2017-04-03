package LintCode.BinarySearch;

/**
 * Created by yanglu on 4/3/17.
 * http://www.lintcode.com/en/problem/find-minimum-in-rotated-sorted-array/
 */
public class MinRotatedSortedArray {
    public int findMin(int[] nums){
        if (nums == null || nums.length == 0){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        //no target the last one as target
        int target = nums[nums.length - 1];
        //first num <= target
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target){
                start = mid;
            }else {
                end = mid;
            }
        }
        if (nums[start] <= target) {
            return nums[start];
        }
        if (nums[end] <= target) {
            return nums[end];
        }
        return -1;
    }
}
