/*

Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Example:

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return 1 ( 1 corresponds to true )

Return 0 / 1 ( 0 if the element is not present, 1 if the element is present ) for this problem

 */

package BinarySearch;

import java.util.ArrayList;

public class MatrixSearch {

    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        int result = 0;
        int m = a.size();
        int n = a.get(0).size();

        int row = 0;
        int col = 0;

        while((row<m) && (col<n)){
            if(a.get(row).get(col) == b){
                result = 1;
                break;
            }
            else if (a.get(row).get(n-1) < b){
                row++;
            }
            else{
                col++;
            }
        }

        return result;
    }
}
