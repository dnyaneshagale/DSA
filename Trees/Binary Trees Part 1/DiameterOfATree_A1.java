import java.util.*;

public class DiameterOfATree_A1 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int leftHalf = height(root.left);
        int rightHalf = height(root.right);

        return (Math.max(leftHalf, rightHalf)+1);
    }

    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight+rightHeight+1;

        return Math.max(selfDiameter, Math.max(rightDiameter, selfDiameter));
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;

            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root) {
            if(root == null) {
                return;
            }

            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void levelOrder(Node root) {
            if(root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node curr = q.remove();

                if(curr == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data + " ");
                    if(curr.left != null) {
                        q.add(curr.left);
                    }

                    if(curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

/*
 *                       1
 *                     /  \
 *                    2     3
 *                   / \   / \
 *                  4   5  6  7
 */

        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};

        BinaryTree tree = new BinaryTree();
       
        Node root = tree.buildTree(nodes);
        tree.levelOrder(root);

        // System.out.println("\nHeight of the Tree is : " + height(root) + "\n");

        System.out.println("Diameter of The Tree is : " + diameter(root));
    }
}
