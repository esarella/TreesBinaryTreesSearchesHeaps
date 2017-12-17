/*

Write a program that takes as its input an instance of TreeNode representing the root of a tree and returns a boolean value
 which is true if the input is a binary search tree and false if it is not.
 */

package Trees;

public class IdentifyBinaryTree {
    public boolean isBST(TreeNode root) {
        return isBSTHelper(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    public boolean isBSTHelper(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.val >= min && root.val < max) {
            return isBSTHelper(root.left, min, root.val) && isBSTHelper(root.right, root.val, max);
        }
        return false;
    }
}
