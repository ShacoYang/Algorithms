package LintCode.BinarySearch;

/**
 * Created by yanglu on 3/30/17.
 * http://www.lintcode.com/en/problem/first-position-of-target/#
 */
public class firstPositionofTarget {
    public int binarySearch(int[] nums, int target){
        //basecase
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start)/2;
            if (nums[mid] > target) {
                end = mid - 1;
            }else if (nums[mid] < target) {
                start = mid + 1;
            }else {
                //start = mid --> last||any position
                end = mid; //first position should closer to left
            }
        }
        //looking for the first position so put start first
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;
    }
}
