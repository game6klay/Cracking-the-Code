package Q3_Level_LinkedList;

import Library.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by jay on 12/22/16.
 */
public class Question {

    // design an algorithm which creates a linked list of all the nodes at each depth level in a binary tree

    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList (TreeNode root) {

        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();

        LinkedList<TreeNode> current = new LinkedList<>();

        if (root != null) {

            current.add(root);
        }

        while(current.size() >0) {
            result.add(current);
            LinkedList<TreeNode> parents = current;

            current = new LinkedList<>();

            for(TreeNode parent :parents) {

                if (parent.left != null) {
                    current.add(parent.left);
                }

                if (parent.right != null ){
                    current.add(parent.right);
                }
            }
         }
        return result;
    }

    public static void print (ArrayList<LinkedList<TreeNode>> result) {

        int depth = 0;
        for (LinkedList<TreeNode> entry: result) {

            Iterator<TreeNode> i = entry.listIterator();
            System.out.print("Link list at depth " + depth + ":");
            while(i.hasNext()){
                System.out.print(" " + ((TreeNode)i.next()).data);
            }
            System.out.println();
            depth++;

        }
    }
}
