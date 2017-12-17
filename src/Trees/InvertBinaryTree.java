/*



Given a binary tree, invert the binary tree and return it.
Look at the example for more details.

Example :
Given binary tree

     1
   /   \
  2     3
 / \   / \
4   5 6   7
invert and return

     1
   /   \
  3     2
 / \   / \
7   6 5   4

See Expected Output




 */


package Trees;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode node = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(node);
        }
        return root;
    }
}
