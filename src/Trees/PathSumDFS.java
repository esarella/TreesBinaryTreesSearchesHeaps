/*
Write a program that takes as its input an instance of TreeNode<Integer> representing the root of a BST and a target
int value and returns an int[][] containing the node values of all paths between the root and any leaf such that the
sum of all the values of the nodes on the path equal the target value.

Hint: Use a depth-first search

Example: Given a target value of 22 and a BST with the following structure:

BST:
          5
         / \
        4   8
       /   / \
      11  13  4
     /  \    / \
    7    2  5   1
There exist two paths from root to leaf that sum to 22: 5→4→11→2 and 5→8→4→5, so the output in this case would be an
 array of two arrays containing those values:

int[][] output = {
  { 5, 4, 11, 2 },
  { 5, 8, 4, 5 }
};

 */

package Trees;

public class PathSumDFS {

    public class TreeNode<E> {
        E value;
        TreeNode<E> left, right;

        public TreeNode(E value) {
            this.value = value;
            this.left = right = null;
        }
    }

    public boolean pathToDFS(TreeNode<Integer> root, int value){
        return pathToDFSHelper(root, 0, value);
    }

    public boolean pathToDFSHelper(TreeNode<Integer> root, int currentSum, int value){
        if(root == null) {
            return false;
        }
        int sum = root.value + currentSum;
        if(sum== value && root.left == null && root.right == null) {
            return true;
        }
        return pathToDFSHelper(root.left, sum, value) || pathToDFSHelper(root.right, sum, value);
    }
}
