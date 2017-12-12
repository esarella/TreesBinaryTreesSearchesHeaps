/*

Given a binary tree, return the inorder traversal of its nodes’ values.

Example :
Given binary tree

   1
    \
     2
    /
   3
return [1,3,2].

Using recursion is not allowed.


 */

package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode a) {
        ArrayList<Integer> solution = new ArrayList<>();

        if (a == null){
            return solution;
        }

        TreeNode current = a;
        Stack<TreeNode> stack = new Stack<>();
        boolean done = false;

        while(!stack.empty() || current !=null){
            if (current != null){
                stack.push(current);
                current = current.left;
            }
            else{
                TreeNode temp = stack.pop();
                solution.add(temp.val);
                current = temp.right;
            }
        }
        return solution;
    }
}
