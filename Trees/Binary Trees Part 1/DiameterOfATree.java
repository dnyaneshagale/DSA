import java.util.*;

public class DiameterOfATree {
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

    // Approach No. 1 //
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int leftHalf = height(root.left);
        int rightHalf = height(root.right);

        return (Math.max(leftHalf, rightHalf)+1);
    }

    public static int diameter(Node root) {  // O(n*n)
        if(root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int leftHeight = height(root.left);

        int rightDiameter = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight+rightHeight+1;

        return Math.max(selfDiameter, Math.max(rightDiameter, leftDiameter));
    }
    // Approach No. 1 END//


    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameterOfTree(Node root) {
        if(root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameterOfTree(root.left);
        Info rightInfo = diameterOfTree(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
        
        return new Info(diam, ht);
    }

    public static void main(String[] args) {

/*
 *                       1
 *                     /  \
 *                    2     3
 *                   / \   / \
 *                  4   5  6  7
 */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println("\nApproach 1 : O(n*n)\n\tDiameter of Tree is : " + diameter(root));

        System.out.println("\n\nApproach 2 : O(n)\n\tDiameter of Tree is : " + diameterOfTree(root).diam+"\n");
    }
}
