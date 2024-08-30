/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            helper(root, result);
        }
        return result;
    }

    private void helper(Node node, List<Integer> result) {
        for (Node child : node.children) {
            helper(child, result);
        }
        result.add(node.val);
    }
}