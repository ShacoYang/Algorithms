package LintCode.BinarySearch;

/**
 * Created by yanglu on 4/3/17.
 * http://www.lintcode.com/en/problem/wood-cut/
 */
public class woodCut {
    public int woodCut (int[] L, int k){
        //basecase
        if (L == null || L.length == 0 || k <=0) {
            return 0;
        }
        // the range of length (1, the longest one)
        int max = 0;
        for (int i = 0; i < L.length; i++) {
            max = Math.max(max, L[i]);
        }
        int start = 1;
        int end = max;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (count(L, mid) >= k){
                start = mid;
            }else {
                end = mid;
            }
        }
        if (count(L, start) >= k){
            return start;
        }
        if (count(L, end) >= k) {
            return end;
        }
        return 0;
    }
    // how many K
    private int count(int[] L, int length) {
        int sum = 0;
        for (int i = 0; i < L.length; i++) {
            sum += L[i] / length;
        }
        return sum;
    }
}
