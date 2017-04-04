package LintCode.BinarySearch;

/**
 * Created by yanglu on 4/3/17.
 */
public class findPeakElement {
    public int findPeak(int[] A) {
        if (A == null || A.length == 0){
            return 0;
        }
        int start = 0;
        int end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > A[mid -1] && A[mid] > A[mid + 1]){
                return mid;
            }else if (A[mid] > A[mid -1] && A[mid] < A[mid + 1]){
                start = mid;
            }else if (A[mid] < A[mid-1] && A[mid] > A[mid + 1]){
                end = mid;
            }else{
                start = mid;
            }
        }
        if (A[start] < A[end]){
            return end;
        }else{
            return start;
        }
    }
}
