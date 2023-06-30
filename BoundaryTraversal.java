/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> traverseBoundary(TreeNode root){
		ArrayList<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        if(!isLeaf(root)){
            result.add(root.data);
        }
        leftNodes(root,result);
        bottomNodes(root,result);
        rightNodes(root,result);
        
        return result;
	}
    public static void leftNodes(TreeNode root,ArrayList<Integer> result){
        TreeNode temp = root.left;
        while(temp!=null){
            if(!isLeaf(temp))
                result.add(temp.data);

            if(temp.left!=null)
                temp = temp.left;
            else
                temp = temp.right;
        }
    }
    public static void bottomNodes(TreeNode root,ArrayList<Integer> result){        
        if(isLeaf(root)){
            result.add(root.data);
            return;
        }    
        if(root.left!=null)
            bottomNodes(root.left,result);
        if(root.right!=null)
            bottomNodes(root.right,result);
    }
    public static void rightNodes(TreeNode root,ArrayList<Integer> result){
        TreeNode temp = root.right;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            if(!isLeaf(temp)) list.add(temp.data);
            if(temp.right!=null)
                temp = temp.right;
            else
                temp = temp.left;
        }
        for(int i=list.size()-1;i>=0;i--){
            result.add(list.get(i));
        }
    }
    public static boolean isLeaf(TreeNode node) {
        if (node == null)
            return false;    
        if (node.right == null && node.left == null)
            return true;
        return false; 
    }
}












