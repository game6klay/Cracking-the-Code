package Q4_CheckBalanced_BT;

import Library.TreeNode;

/**
 * Created by jay on 12/22/16.
 */
public class Question {


    // to check if a given binary tree is balanced or not

    public static boolean isBalanced (TreeNode root) {

        // check the height of the left and right subtrees
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(heightDiff) > 1) {
            return false;

        }
        return isBalanced(root.left) && isBalanced(root.right);

    }

    private static int getHeight(TreeNode root) {

        if (root == null) {
            return -1;
        }

        return Math.max(getHeight(root.left),getHeight(root.right));
    }


}
