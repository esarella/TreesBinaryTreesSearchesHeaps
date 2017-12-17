package Trees;

public class SortTreesByColumn {

//    public interface LinkedListNode<E> {
//
//        /* getter/setter for this node's value */
//        E getValue();
//        void setValue(E value);
//
//        /* getter/setter for the subsequent node, or null if this is the last node */
//        LinkedListNode<E> getNext();
//        void setNext(LinkedListNode<E> next);
//
//        /**
//         * Initialize this node and all of its subsequent nodes from
//         * an array of values, starting with the head value at index 0
//         *
//         * @param listValues - the ordered values for the whole list
//         */
//        void setValuesFromArray(E[] listValues);
//    }
//
//    public class LinkedListNodeImp<E>{
//
//        private E value;
//        private LinkedListNodeImp<E> next;
//
//        public LinkedListNodeImp(){
//            this.value = null;
//            this.next = null;
//        }
//
//        public LinkedListNodeImp(E value){
//            this.value = value;
//            this.next = null;
//        }
//
//        /* getter/setter for this node's value */
//        public E getValue(){
//            return this.value;
//        }
//
//        public void setValue(E value){
//            this.value = value;
//        }
//
//        /* getter/setter for the subsequent node, or null if this is the last node */
//
//        public LinkedListNodeImp<E> getNext(){
//            if(this.next == null)
//                return null;
//            else
//                return this.next;
//        }
//
//        public void setNext(LinkedListNode<E> next){
//            this.next = (LinkedListNodeImp<E>) next;
//        }
//
//        /**
//         * Initialize this node and all of its subsequent nodes from
//         * an array of values, starting with the head value at index 0
//         *
//         * @param listValues - the ordered values for the whole list
//         */
//        public void setValuesFromArray(E[] listValues){
//            this.value = listValues[0];
//            LinkedListNodeImp<E> current = this;
//
//            for(int i=1; i<listValues.length; i++){
//                LinkedListNodeImp<E> newNode = new LinkedListNodeImp<E>(listValues[i]);
//                current.setNext(newNode);
//                current = newNode;
//            }
//        }
//
//        public void display(){
//            System.out.print(this.getValue());
//            LinkedListNodeImp<E> current = (LinkedListNodeImp<E>) this.getNext();
//            while(current != null){
//                System.out.print("->"+current.getValue());
//                current = (LinkedListNodeImp<E>) current.getNext();
//            }
//        }
//    }
//    public static void main(String[] args) {
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.addNode(5);
//        bst.addNode(4);
//        bst.addNode(8);
//        bst.addNode(11);
//        bst.addNode(13);
//        bst.addNode(1);
//        bst.addNode(7);
//        bst.addNode(2);
//        bst.addNode(9);
//
//        SortTreesByColumn s = new SortTreesByColumn();
//        int leftExtent = s.getLeftExtent(bst.getRootNode());
//        int rightExtent = s.getRightExtent(bst.getRootNode());
//        int treeHeight = s.getTreeHeight(bst.getRootNode());
//
//        System.out.println("Left extent: "+leftExtent);
//        System.out.println("Right extent: "+rightExtent);
//        System.out.println("Tree height: "+treeHeight);
//
//        LinkedListNodeImp<Integer>[][] matrix = new LinkedListNodeImp[treeHeight][leftExtent+rightExtent+1];
//
//        s.putNodesInMatrix(bst.getRootNode(), matrix, 0, leftExtent);
//
//        s.printColumnWise(matrix);
//    }
//
//    public int getLeftExtent(TreeNode<Integer> node){
//        if(node == null)
//            return 0;
//        int leftSubtree = 0;
//        int rightSubtree = 0;
//        if(node.left != null)
//            leftSubtree = 1+getLeftExtent(node.left);
//
//        if(node.right != null)
//            rightSubtree = -1+getLeftExtent(node.right);
//
//        return Math.max(leftSubtree, rightSubtree);
//    }
//
//    public int getRightExtent(TreeNode<Integer> node){
//        if(node == null)
//            return 0;
//
//        int leftSubtree = 0;
//        int rightSubtree = 0;
//        if(node.left != null)
//            leftSubtree = -1+getRightExtent(node.left);
//
//        if(node.right != null)
//            rightSubtree = 1+getRightExtent(node.right);
//
//        return Math.max(leftSubtree, rightSubtree);
//    }
//
//    public int getTreeHeight(TreeNode<Integer> node){
//        if(node == null)
//            return 0;
//
//        int leftSubtree = 1 + getTreeHeight(node.left);
//        int rightSubtree = 1 + getTreeHeight(node.right);
//        return Math.max(leftSubtree, rightSubtree);
//    }
//
//    public void putNodesInMatrix(TreeNode<Integer> treeNode, LinkedListNodeImp<Integer>[][] matrix, int row, int col){
//        if(treeNode == null)
//            return;
//
//        if(matrix[row][col] == null)
//            matrix[row][col] = new LinkedListNodeImp<Integer>(treeNode.value);
//        else
//            matrix[row][col].setNext(new LinkedListNodeImp<Integer>(treeNode.value));
//
//        putNodesInMatrix(treeNode.left, matrix, row+1, col-1);
//        putNodesInMatrix(treeNode.right, matrix, row+1, col+1);
//    }
//
//    public void printColumnWise(LinkedListNodeImp<Integer>[][] matrix) {
//        int row = matrix.length;
//        int col = matrix[0].length;
//        boolean firstNotPrinted = true;
//
//        for (int i = 0; i < col; i++)
//            for (int j = 0; j < row; j++) {
//                if (matrix != null) {
//                    LinkedListNodeImp<Integer> node = matrix[j][i];
//                    while (node != null) {
//                        if (firstNotPrinted) {
//                            System.out.print(node.getValue().toString());
//                            node = node.getNext();
//                            firstNotPrinted = false;
//                        } else {
//                            System.out.print(" -> " + node.getValue().toString());
//                            node = node.getNext();
//                        }
//
//                    }
//                }
//            }
//
//    }
}
