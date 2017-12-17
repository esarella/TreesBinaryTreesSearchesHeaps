/*

A binary tree is a multi-node data structure where each node has, at most, two child nodes and one stored value. It may either be:
An empty tree, where the root is null.
A tree with a non-null root node that contains a value and two subtrees, left and right, which are also binary trees.

A binary tree is a binary search tree (BST) if all the non-null nodes exhibit two properties:
Each node's left subtree contains only values that are lower than its own stored value.
Each node's right subtree contains only values that are higher than its own stored value.

A pre-order traversal is a tree traversal method where the current node is visited first, then the left subtree, and then the right subtree. The following pseudocode parses a tree into a list using pre-order traversal:
If the root is null, output the null list.
For a non-null node:
Make a list, left, by pre-order traversing the left subtree.
Make a list, right, by pre-order traversing the right subtree.
Output the stored value of the non-null node, append left to it, then append right to the result.
For more detail, see the diagram in the Explanation section below.

Given q queries where each query consists of a list of numbers, determine if the sequence of numbers describes the pre-order traversal of a binary search tree (BST). For each query, print YES on a new line if its list describes a valid pre-order traversal of a BST; otherwise, print NO.

Input Format
The first line contains an integer, q, denoting the number of queries.
The 2·q subsequent lines describe each query over two lines:
The first line contains an integer, n, denoting the number of nodes in the tree.
The second line contains a list of n distinct space-separated integers in the inclusive range [1, n] describing a pre-order traversal of a binary tree.

Constraints
1 ≤ q ≤ 10
1 ≤ n ≤ 100

Output Format
For each query, print YES on a new line if the query describes the pre-order traversal of a valid BST; otherwise, print NO instead.

Sample Input
5
3
1 3 2
3
2 1 3
6
3 2 1 5 4 6
4
1 3 4 2
5
3 4 5 1 2

Sample Output
YES
YES
YES
NO
NO

Explanation
The diagram below depicts the valid binary search trees for the first three queries:
￼

We perform the following q = 5 queries:
Diagram (a)'s pre-order traversal matches the pre-order traversal in the first query, 1 3 2, so we print YES on a new line to indicate that the traversal matches a valid BST.
Diagram (b)'s pre-order traversal matches the pre-order traversal in the second query, 2 1 3, so we print YES on a new line to indicate that the traversal matches a valid BST.
Diagram (c)'s pre-order traversal matches the pre-order traversal in the first query, 3 2 1 5 4 6, so we print YES on a new line to indicate that the traversal matches a valid BST.
The fourth query, 1 3 4 2, is not a pre-order traversal of a binary search tree. We know that the root is 1 because that is the first value in the list. For the second value to be 3, it must be the right child of 1. For the third value to be 4, it must be the right child of 3. For 2 to be the last value in the traversal, it would have to be the left child of 4; however, this would break the order property of a binary search tree because a value less than 3 would be in 3's right subtree. Thus, we print NO on a new line.
The fifth query, 3 4 5 1 2, is not a pre-order traversal of a binary search tree. We know that the root is 3 because that is the first value in the list. For the second value to be 4, it must be the right child of 3. For the third value to be 5, it must be the right child of 4. For the fourth value to be 1, it must be the left child of 5; however, this would break the order property of a binary search tree because a value less than 4 would be in 4's right subtree. Thus, we print NO on a new line.



 */


package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidBinarySearchTree {


    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < size; i++){

            int sizeOfTree = Integer.parseInt(scanner.nextLine());
            String[] inputLine = scanner.nextLine().split(" ");
            printArray(inputLine);

//            System.out.println(inputLine);
            ArrayList<Integer> tree = new ArrayList<>();

            for (int j = 0 ; j < inputLine.length; j++){
                tree.add(Integer.parseInt(inputLine[j]));
            }

            printTree(tree);


            if(isValidBST(tree)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    public static void printArray(String[] input){
        for (int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }
    public static void printTree(ArrayList<Integer> tree){
        for (Integer x : tree){
            System.out.println(x);
        }
    }

    public static boolean isValidBST(ArrayList<Integer> tree){

        if(tree.size() == 1){
            return true;
        }
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        Integer root = tree.get(0);
        int index = 1;

        while(tree.get(index) < root){
            left.add(tree.get(index++));

            if (index > tree.size()){
                break;
            }
        }

        if(!(index >= tree.size())){
            while(tree.get(index) > root){
                right.add(tree.get(index++));

                if (index > tree.size()){
                    break;
                }
            }
        }

        if (left.size() + right.size() == tree.size() - 1){
            if (left.size() == 0){
                return true && isValidBST(right);
            }
            else if (right.size() == 0){
                return true && isValidBST(left);
            }
            else {
                return isValidBST(right) && isValidBST(left);
            }
        }

        else{
            return false;
        }
    }
}
