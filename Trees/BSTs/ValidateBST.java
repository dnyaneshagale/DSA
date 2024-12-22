import BSTs.*;
import BSTs.IntroductionOfBST.Node;

import java.util.*;

public class ValidateBST {

    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }

        if(min != null && root.data <= min.data) {
            return false;
        }

        else if(max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        
        IntroductionOfBST bst = new IntroductionOfBST();
        int[] values = {2, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        Node root = null;

        for(int i = 0; i < values.length; i++) {
            root = bst.insert(root, values[i]);
        }
        bst.inOrder(root);

        if(isValidBST(root, null, null)) {
            System.out.println("\nIs Valid BST");
        } else {
            System.out.println("\nIs Not a Valid BST");
        }
    }
}
