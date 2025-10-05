package N872_LeafSimilarTrees;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public class TreeNode {
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();   
        List<Integer> leaf2 = new ArrayList<>();   
        getLeaf(root1, leaf1);  
        getLeaf(root2, leaf2);  
        return leaf1.equals(leaf2); 
    }

    public void getLeaf(TreeNode root, List<Integer> leaf) {
        if (root == null) return;                 
        if (root.left == null && root.right == null) {
            leaf.add(root.val);                   
        }
        getLeaf(root.left, leaf);  
        getLeaf(root.right, leaf);  
    }

}
