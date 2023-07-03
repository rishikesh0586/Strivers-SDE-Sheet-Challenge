/*************************************************************
 
    Following is the Binary Tree node structure

    class BinaryTreeNode 
    {
    public : 
        T data;
        BinaryTreeNode<T> *left;
        BinaryTreeNode<T> *right;

        BinaryTreeNode(T data) {
            this -> data = data;
            left = NULL;
            right = NULL;
        }
    };

*************************************************************/

#include<bits/stdc++.h>
void solve(BinaryTreeNode<int>*root,vector<int>&ans){
    if(root){
        solve(root->left,ans);
        ans.push_back(root->data);
        solve(root->right,ans);
    }
}

bool validateBST(BinaryTreeNode<int> *root) {
    vector<int>ans;
    vector<int>check;
    solve(root,ans);
    check=ans;
    sort(check.begin(),check.end());
    if(check==ans){
        return true;
    }
    return false;
}