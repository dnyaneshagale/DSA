public class LowestCommonAncestorA2 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node lowestCommonAncestorA2(Node root, int n1, int n2) {
        
        if(root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lowestCommonAncestorA2(root.left, n1, n2);
        Node rightLca = lowestCommonAncestorA2(root.right, n1, n2);

        if(leftLca == null) {
            return rightLca;
        }

        if(rightLca == null) {
            return leftLca;
        }

        return root;
    }
    public static void main(String[] args) {

        /*               
         *               1
         *          /        \
         *         2          3
         *       /    \     /   \
         *      4      5   6     7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println((lowestCommonAncestorA2(root, 4, 5)).data);
        
    }
}
