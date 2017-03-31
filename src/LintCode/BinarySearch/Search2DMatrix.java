package LintCode.BinarySearch;

/**
 * Created by yanglu on 3/31/17.
 * http://www.lintcode.com/en/problem/search-a-2d-matrix/
 */
public class Search2DMatrix {
    //Binary search once
    //make it as a one dimension array
    public boolean searchMatrix(int[][] matrix, int target){
        if (matrix == null || matrix.length == 0){
            return false;
        }
        if (matrix[0] == null || matrix[0].length == 0){
            return false;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int start = 0;
        int end = row * column - 1;
        while (start + 1 < end) {
            //assume one dimension [1,3,5,7,10,11,16....]
            int mid = start + (end - start) / 2;
            //mid / column --> [*]
            //mid % column --> [][*]
            int number = matrix[mid / column][mid % column];
            if (number == target) {
                return true;
            }else if (number > target) {
                end = mid;
            }else {
                start = mid;
            }
        }
        if (matrix[start / column][start % column] == target) {
            return true;
        }
        if (matrix[end / column] [end % column] == target) {
            return true;
        }
        return false;

    }
}
