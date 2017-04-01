package LintCode.BinarySearch;

/**
 * Created by yanglu on 4/1/17.
 * http://www.lintcode.com/en/problem/search-in-a-big-sorted-array/#
 */
public class bigSortedArray {
    public int searchBigSortedArray(ArrayReader reader, int target){
        //double method
        int index = 1;
        while (reader.get(index - 1) < target) {
            index = index * 2;
        }
        int start = 0;
        int end = index - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (reader.get(mid) < target) {
                start = mid;
            }else {
                end = mid;
            }
        }
        if (reader.get(start) == target) {
            return start;
        }
        if (reader.get(end) == target) {
            return end;
        }
        return -1;
    }
}
