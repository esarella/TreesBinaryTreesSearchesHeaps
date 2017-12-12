/*

Given a binary tree, return the preorder traversal of its nodes’ values.

Example :
Given binary tree

   1
    \
     2
    /
   3
return [1,2,3].

Using recursion is not allowed.

 */

package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {
    public ArrayList<Integer> preorderTraversal(TreeNode a) {

        ArrayList<Integer> solution = new ArrayList<>();

        if (a == null) return solution;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = a;
        stack.push(current);

        while (!stack.empty()) {

            current = stack.pop();
            solution.add(current.val);

            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);

        }
        return solution;
    }
}
