package LintCode.BinarySearch;

/**
 * Created by yanglu on 4/3/17.
 */
public class sqrt {
    public int sqrt(int x){
        // long otherwise over limit
        long start = 1;
        long end = x;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid <= x) {
                start = mid;
            }else {
                end = mid;
            }
        }
        if (end * end <= x) {
            return (int)end;
        }
        return (int) start;
    }
}
