/*

Consider the algorithm below which takes an array, keys, of n unique integers and inserts each integer in order into an empty binary search tree:

// Before: create a variable named 'counter' that counts calls to insert. Initialize 'counter' to 0.

createBST(int[] keys) {
    set the value of counter to 0

    for each (key in keys) {
        if (tree has a root node) {
            insert(root, key)
        }
        else {
            create a new node with value 'key' as the root node of tree
        }

        print the value of 'counter' on a new line
    }
}

insert(root, key) {
    increment the value of counter by 1

    if (key is less than the value of root node) {
        if (root node has no left child) {
            create a new node with value 'key' as the left child of root node
        }
        else {
            insert(left child of root node, key)
        }
    }
    else {
        if (root node has no right child) {
            create a new node with value 'key' as the right child of root node
        }
        else {
            insert(right child of root node, key)
        }
    }
}

Note: Recall that a Binary Search Tree is a Binary Tree in which all elements in a node's left subtree are ≤ all elements in the node's right subtree.

Complete the createBST function in the editor below. It has 1 parameter: an array of n unique integers, keys. The function must implement the above algorithm as well as any additional variables, functions, or classes necessary to make the implementation work.

Input Format
Locked stub code in the editor reads the following input from stdin and passes it to the function:
The first line contains an integer, n, denoting the size of the keys array.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer describing the value of element i in keys.

Constraints
1 ≤ n ≤ 2 × 105
1 ≤ keysi ≤ n
The keys array contains no duplicate elements.

Output Format
The function must print the value of the counter variable on a new line after each insertion of a key into the tree.

Sample Input 0
3
2
1
3

Sample Output 0
0
1
2

Explanation 0
We perform the following sequence of insertions:
key = 2: As the tree is currently empty, we create a new node with value 2 and designate it as the root node. We then print the value of counter; as no calls to the insert function have been made yet, we print 0 on a new line.
key = 1: As the tree has a root node, we make a call to the insert function. The insert function only runs once before the node is inserted into the root's left subtree, so the value of counter is only incremented once. We then print the value of the counter, 1, on a new line.
key = 3: As the tree has a root node, we make a call to the insert function. The insert function only runs once before the node is inserted into the root's right subtree, so the value of counter is only incremented once; as counter was already incremented once during the previous insertion, its value is now 2. We then print the value of counter, 2, on a new line.

Sample Input 1
3
1
2
3

Sample Output 1
0
1
3

Explanation 1
We perform the following sequence of insertions:
key = 1: As the tree is currently empty, we create a new node with value 1 and designate it as the root node. We then print the value of counter; as no calls to the insert function have been made yet, we print 0 on a new line.
key = 2: As the tree has a root node, we make a call to the insert function. The insert function only runs once before the node is inserted into the root's right subtree, so the value of counter is only incremented once. We then print the value of the counter, 1, on a new line.
key = 3: As the tree has a root node, we make a call to the insert function. The insert function runs twice before the node is inserted into the right subtree of the root's right subtree, so the value of counter is incremented twice; as counter was already incremented once during the previous insertion, its value is now 3. We then print the value of counter, 3, on a new line.



 */

package Exam;

import java.util.Scanner;

public class CreateABinarySearchTree {

    static int counter = 0;
    /*
     * Complete the function below.
     */
    static void createBST(int[] keys) {
        //counter = 0;

        TreeNode root = null;

        for (int key : keys){
            if(root != null){
                insert(root, key);
            }
            else{
                root = new TreeNode(key);
            }
            System.out.println(counter);
        }
    }

    static void insert(TreeNode root, int key){
        counter++;
        if (key < root.val){
            if (root.left == null){
                root.left = new TreeNode(key);
            }
            else {
                insert(root.left,key);
            }
        }
        else {
            if (root.right == null){
                root.right = new TreeNode(key);
            }
            else{
                insert(root.right, key);
            }
        }
    }

    static class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int keys_size = 0;
        keys_size = Integer.parseInt(in.nextLine().trim());

        int[] keys = new int[keys_size];
        for(int i = 0; i < keys_size; i++) {
            int keys_item;
            keys_item = Integer.parseInt(in.nextLine().trim());
            keys[i] = keys_item;
        }

        createBST(keys);

    }
}
