/*

Amy has an array, nums, of n positive integers and another array, maxes, of m positive integers. For each maxesi in maxes, she wants to know the total number of elements in nums which are less than or equal to that maxesi. For example, if nums = [1, 2, 3] and maxes = [2, 4], then there are 2 elements in nums that are ≤ maxes0 (which is 2) and 3 elements in nums that are ≤ maxes1 (which is 4). We can store these respective answers in another array, answer = [2, 3].

Complete the counts function in the editor below. It has two parameters:
An array, nums, of n positive integers.
An array, maxes, of m positive integers.
The function must return an array of m positive integers in which the integer at each index i (where 0 ≤ i < m) denotes the total number of elements numsj (where 0 ≤ j < n) satisfying numsj ≤ maxesi.

Input Format
Locked stub code in the editor reads the following input from stdin and passes it to the function:
The first line contains an integer, n, denoting the number of elements in nums.
Each line j of the n subsequent lines (where 0 ≤ j < n) contains an integer describing numsj.
The next line contains an integer, m, denoting the number of elements in maxes.
Each line i of the m subsequent lines (where 0 ≤ i < m) contains an integer describing maxesi.

Constraints
2 ≤ n, m ≤ 105
1 ≤ numsj ≤ 109, where 0 ≤ j < n.
1 ≤ maxesi ≤ 109, where 0 ≤ i < m.

Output Format
The function must return an array of m integers where the value stored at each index i (where 0 ≤ i < m) denotes the total number of elements numsj (where 0 ≤ j < n) satisfying numsj ≤ maxesi. This is printed to stdout by locked stub code in the editor.

Sample Input 0
4
1
4
2
4
2
3
5

Sample Output 0
2
4

Explanation 0
We are given n = 4, nums = [1, 4, 2, 4], m = 2, and maxes = [3, 5].
For maxes0 = 3, we have two elements in nums (nums0 = 1 and nums2 = 2) that are ≤ maxes0.
For maxes1 = 5, we have four elements in nums (nums0 = 1, nums1 = 4, nums2 = 2, and nums3 = 4) that are ≤ maxes1.
Thus, the function returns the array [2, 4] as the answer.

Sample Input 1
5
2
10
5
4
8
4
3
1
7
8

Sample Output 1
1
0
3
4

Explanation 1
We are given, n = 5, nums = [2, 10, 5, 4, 8], m = 4, and maxes = [3, 1, 7, 8].
For maxes0 = 3, we have one element in nums (nums0 = 2) that is ≤ maxes0.
For maxes1 = 1, there are zero elements in nums that are ≤ maxes1.
For maxes2 = 7, we have three elements in nums (nums0 = 2, nums2 = 5, and nums3 = 4) that are ≤ maxes2.
For maxes3 = 8, we have four elements in nums (nums0 = 2, nums2 = 5, nums3 = 4, and nums4 = 8) that are ≤ maxes3.
Thus, the function returns the array [1, 0, 3, 4] as the answer.

 */

package Exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleQueries {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int[] res;
        int nums_size = 0;
        nums_size = Integer.parseInt(in.nextLine().trim());

        int[] nums = new int[nums_size];
        for(int i = 0; i < nums_size; i++) {
            int nums_item;
            nums_item = Integer.parseInt(in.nextLine().trim());
            nums[i] = nums_item;
        }

        int maxes_size = 0;
        maxes_size = Integer.parseInt(in.nextLine().trim());

        int[] maxes = new int[maxes_size];
        for(int i = 0; i < maxes_size; i++) {
            int maxes_item;
            maxes_item = Integer.parseInt(in.nextLine().trim());
            maxes[i] = maxes_item;
        }

        res = counts(nums, maxes);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }

    static int[] counts(int[] nums, int[] maxes) {

        int numsLength = nums.length;
        int maxLength = maxes.length;

        int [] result = new int[maxLength];
        Arrays.sort(nums);

        for(int i = 0 ; i < maxLength; i++){
            int max = maxes[i];
            int count  = 0;
            for (int num : nums){
                if (num > max){
                    break;
                }
                if (num <= max){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }




}
