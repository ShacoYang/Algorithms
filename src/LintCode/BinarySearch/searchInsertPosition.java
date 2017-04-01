package LintCode.BinarySearch;

/**
 * Created by yanglu on 4/1/17.
 * http://www.lintcode.com/en/problem/search-insert-position/
 */
public class searchInsertPosition {
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0){
            return 0;
        }
        int start = 0;
        int end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > target) {
                end = mid;
            }else if (A[mid] < target) {
                start = mid;
            }else if (A[mid] == target){
                end = mid;
            }
        }
        if (A[start] >= target) {
            return start;
        }
        if (A[end] >= target) {
            return end;
        }
        //end < target
        return A.length; //=== return end + 1
        //target < start --> return start;
    }
}
