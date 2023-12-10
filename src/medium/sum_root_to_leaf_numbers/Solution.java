package medium.sum_root_to_leaf_numbers;

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
    public static int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public static int helper(TreeNode node, int currentSum) {
        if (node == null) {
            return 0;
        }
        int newSum = currentSum * 10 + node.val;
        if (node.left == null && node.right == null) {
            return newSum;
        }
        int leftSum = helper(node.left, newSum);
        int rightSum = helper(node.right, newSum);
        return leftSum + rightSum;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        System.out.println(sumNumbers(root));
    }

}
