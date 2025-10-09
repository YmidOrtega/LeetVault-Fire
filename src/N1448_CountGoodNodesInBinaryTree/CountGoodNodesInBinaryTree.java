package N1448_CountGoodNodesInBinaryTree;

public class CountGoodNodesInBinaryTree {
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
    
    public int goodNodes(TreeNode root) {
        int maxi = -10001;
        return dfs(root,maxi);
    }

    public int dfs(TreeNode curr, int maxi){
        if(curr==null){
            return 0;
        }
        if (curr.val>=maxi){
            int left = dfs(curr.left,curr.val);
            int right = dfs(curr.right,curr.val);
            return 1+left+right;
        } else{
            int left = dfs(curr.left,maxi);
            int right = dfs(curr.right,maxi);
            return left+right;
        }       
    }
}
