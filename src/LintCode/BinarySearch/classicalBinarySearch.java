package LintCode.BinarySearch;

/**
 * Created by yanglu on 3/30/17.
 * http://www.lintcode.com/en/problem/classical-binary-search/
 */
//find any position
public class classicalBinarySearch {

    public int findPosition(int[] nums, int target){
        //basecase
        if (nums == null || nums.length == 0){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        //start + 1 < end
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            }else if (nums[mid] > target) {
                end = mid - 1;
            }else {
                start = mid;
            }
        }
        //return any so start || end both ok
        if (nums[start] == target){
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;

    }
}
