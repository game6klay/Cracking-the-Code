package Q5_Check_If_BST;

import Library.TreeNode;

/**
 * Created by jay on 12/22/16.
 */
public class Question {

    // check if a binary tree is binary search tree or not

    // possible solution would be to do an inorder traversal and copy all the values in an array
    // this would not work if it has duplicate values
    // because it can not handle the invalid cases with duplicates

    public static boolean isBST (TreeNode root) {

        int[] arrayMain = inOrder(root);

        for(int i =0;i<arrayMain.length-2; i++) {

            if (arrayMain[i]>=arrayMain[i+1]) {
                return false;
            }
        }

        return true;
    }

    private static int[] inOrder (TreeNode root) {

        int[] array = new int[root.size()];
        int arrayCounter = 0;
        if (root != null) {

            inOrder(root.left);

            array[arrayCounter] = root.data;
            arrayCounter ++;

            inOrder(root.right);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        TreeNode node = TreeNode.createMinimalBST(array);

        System.out.println(isBST(node));
    }
}

/*
*
* Alternative function for the isBST could be given as below which is more of an optimal solution
*
* public static boolean isBST (TreeNode root, int min, int max) {
*
*       max = INTEGER.MAX;
*       min = INTEGER.MIN:
*
*       if (root == null) {
*
*           return true;
*       }
*
*       if (root.data < min && root.data > max) {
*
*           return false;
*
*       }
*       else
*
*           return isBST(root.left,min, root.data) && isBST(root.right,root.data, max);
* }
*
*
* */
