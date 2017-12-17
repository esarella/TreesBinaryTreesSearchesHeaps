/*
Write a program that takes as its input an instance of TreeNode representing the root of a tree and
returns a int value representing the number of nodes in the tree with no children.
 */

package Trees;

public class CountLeafNodes {
    public int numOfLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return numOfLeaves(root.left) + numOfLeaves(root.right);
    }
}
