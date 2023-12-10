package easy.binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public static void helper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        helper(node.left, result);
        result.add(node.val);
        helper(node.right, result);
    }

    public static void printInorderTraversal(List<Integer> traversal) {
        System.out.print("[");
        for (int i = 0; i < traversal.size(); i++) {
            System.out.print(traversal.get(i));
            if (i < traversal.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> traversal = inorderTraversal(root);
        printInorderTraversal(traversal);

    }

}
