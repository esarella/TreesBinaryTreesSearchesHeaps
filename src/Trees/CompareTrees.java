/*

Write a program that takes as its input two instances of TreeNode and returns a boolean value which is true if
both trees have an identical structure with the same node values.

*/

package Trees;

public class CompareTrees {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }
        if ((root1 != null && root2 == null) || (root1 == null && root2 != null)){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }

        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }
}
