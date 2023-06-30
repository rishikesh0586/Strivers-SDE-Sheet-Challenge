/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/
import java.util.*;
public class Solution {
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getOrder(root,list);
        return list;
    }
    public static void getOrder(TreeNode root, List<Integer> list){
        if(root==null)
            return ;

        getOrder(root.left,list);
        getOrder(root.right,list);
        list.add(root.data);
        
        return ;
    }
}