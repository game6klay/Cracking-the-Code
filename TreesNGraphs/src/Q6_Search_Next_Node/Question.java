package Q6_Search_Next_Node;

import Library.TreeNode;

/**
 * Created by jay on 12/22/16.
 */
public class Question {

    public static TreeNode inOrderSuccesorBST (TreeNode n) {

        if (n == null) return null;

        if (n.parent == null || n.right != null) {

            return leftMostChild(n.right);
        }

        else {

            TreeNode q = n;
            TreeNode x = q.parent;

            while (x != null && x.left != q) {

                q=x;
                x=x.parent;
            }

            return x;
        }

    }

    private static TreeNode leftMostChild(TreeNode n) {

        if (n == null) {
            return null;
        }
        while (n.left != null) {
            n = n.left;
        }
        return n;

    }

}
