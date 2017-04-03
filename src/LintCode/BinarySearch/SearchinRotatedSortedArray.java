package LintCode.BinarySearch;

/**
 * Created by yanglu on 4/3/17.
 * http://www.lintcode.com/en/problem/search-in-rotated-sorted-array/#
 */
public class SearchinRotatedSortedArray {
    public int search(int[] A, int target) {
        //basecase
        if (A == null || A.length ==0) {
            return -1;
        }
        int start = 0;
        int end = A.length - 1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //diagram
            if (A[mid] == target) {
                return mid;
            }
            if (A[start] <= A[mid]){
                //<M || >S
                if (A[start] <= target && A[mid] >= target){
                    end = mid;
                }else {
                    start = mid;
                }
            }else {
                if (A[mid] <= target && A[end] >= target) {
                    start = mid;
                }else {
                    end = mid;
                }
            }
        }
        if (A[start] == target) {
            return start;
        }
        if (A[end] == target) {
            return  end;
        }
        return -1;
    }
}
