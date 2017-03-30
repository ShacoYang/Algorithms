package LintCode.BinarySearch;

/**
 * Created by yanglu on 3/30/17.
 * http://www.lintcode.com/en/problem/last-position-of-target/#
 */
public class lastPositionofTarget {

    public int lastPosition(int nums[], int target){
        //basecase
        if (nums == null || nums.length == 0){
            return -1;
        }
        int start = 0, end = nums.length - 1;

        //start + 1 < end avoid infinite loop
        //[2,2] start = 0 end = 1; --> mid always 0
        while (start + 1 < end) {
            int mid = start + (end - start) / 2; //int mid = (start + end)/2 overflow
            if (nums[mid] < target) {
                start = mid + 1;
            }else if (nums[mid] > target) {
                end = mid - 1;
            }else {
                start = mid;
            }
        }
        //end first cause we need to find the last-position
        if (nums[end] == target){
            return end;
        }
        if (nums[start] == target){
            return  start;
        }
        return -1;

    }
}
