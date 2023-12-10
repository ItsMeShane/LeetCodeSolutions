package easy.consruct_string_from_binary_string;

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

    public static String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        String result = String.valueOf(root.val);

        if (root.left != null || root.right != null) {
            result += "(" + tree2str(root.left) + ")";
        }

        if (root.right != null) {
            result += "(" + tree2str(root.right) + ")";
        }

        return result;
    }


    public static void main(String[] args) {
        // "1(2(4))(3)"
        System.out.println(tree2str(new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3))));
        // "1(2()(4))(3)"
        System.out.println(tree2str(new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3))));
    }

}
