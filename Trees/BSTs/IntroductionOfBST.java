public class IntroductionOfBST {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            //Left Subtree
            root.left = insert(root.left, val);
        } else {
            //Right Subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }

        if(root.data > key) {
            return search(root.left, key);
        } 

        else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if(root.data > val) {
            root.left = delete(root.left, val);
        }
        else if(root.data < val) {
            root.right = delete(root.right, val);
        } 
        else {

            // CASE 1 =>  (Leaf Nodes (0 Children))
            if(root.left == null && root.right == null) {
                return null;
            }

            // CASE 2 =>  (Only 1 child)
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            //Case 3 => 

            Node inOrdSucc = findInorderSuccessor(root.right);
            root.data = inOrdSucc.data;
            root.right = delete(root.right, inOrdSucc.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    public static void main(String[] args) {
        int[] values = {2, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        Node root = null;

        for(int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);

        System.out.println("\n");


        delete(root, 8);
        inOrder(root);
    }
}
