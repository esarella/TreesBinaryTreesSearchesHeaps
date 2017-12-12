/*
Implement int sqrt(int x).

Compute and return the square root of x.

If x is not a perfect square, return floor(sqrt(x))

Example :

Input : 11
Output : 3
DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY

 */

package BinarySearch;

public class SqareRootOfInteger {
    public int sqrt(int a) {
        int low, high, root;
        int mid;

        low = 1;
        high = a;
        root = 0;

        while (low <= high) {

            mid = (low + high) / 2;

            if (mid == a / mid && (a % mid == 0))
                return mid;

            if (mid <= a / mid) {
                root = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return root;
    }
}
