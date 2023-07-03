/*

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

*/

public class Solution 
{

	public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) 
    {		
        if(root==null){
            return null;
        }
        
        Integer val = root.data;
        if(val<p.data && val<q.data)
            return LCAinaBST(root.right,p,q);
        
        if(val>p.data && val>q.data)
            return LCAinaBST(root.left,p,q);
        
        return root;
	}
}














