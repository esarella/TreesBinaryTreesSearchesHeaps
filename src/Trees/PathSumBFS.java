/*

Write a program that takes as its input an instance of TreeNode<Integer> representing the root of a BST and a target int value and returns a boolean value which is true if the tree contains a path between the root and any leaf such that the sum of all the values of the nodes on the path equal the target value.

Hint: Use a breadth-first search

Example: Given a target value of 22 and a BST with the following structure:

BST:
          5
         / \
        4   8
       /   / \
      11  13  4
     /  \      \
    7    2      1

The path 5→4→11→2 sums to 22, so the output in this case would be true.
 */

package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PathSumBFS {

    private boolean pathSum(TreeNode root, int target) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> qSum = new LinkedList<>();
        queue.offer(root);
        qSum.offer(0);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int sum = qSum.poll();
            if (node.left  == null && node.right == null && node.val + sum == target) {
                return true;
            }
            if (node.left != null) {
                queue.offer(node.left);
                qSum.offer(node.left.val + sum);
            }
            if (node.right != null) {
                queue.offer(node.right);
                qSum.offer(node.right.val + sum);
            }

        }
        return false;
    }
}
