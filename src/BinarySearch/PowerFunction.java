/*

Implement pow(x, n) % d.

In other words, given x, n and d,

find (xn % d)

Note that remainders on division cannot be negative.
In other words, make sure the answer you return is non negative.

Input : x = 2, n = 3, d = 3
Output : 2

2^3 % 3 = 8 % 3 = 2.


 */

package BinarySearch;

public class PowerFunction {
    public int pow(int x, int n, int d) {
        long a = x;
        long result = 1;

        while(n>0){
            if(n % 2 == 1){
                result = result * a;
                result = result % d;
            }

            a = a*a;
            a = a%d;
            n = n>>1;

        }
        result = (result + d) % d;
        return (int)result;
    }
}
