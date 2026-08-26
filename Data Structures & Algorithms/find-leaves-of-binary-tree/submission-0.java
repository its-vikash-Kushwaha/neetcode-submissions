/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }v
 * }
 */

class Solution {
   HashMap<Integer,List<Integer>> map=new HashMap<>();

    int height(TreeNode root){
        if(root==null)return 0;

        int lh=height(root.left);
        int rh=height(root.right);
        int h=1+Math.max(lh,rh);
        if(!map.containsKey(h)){
            map.put(h,new ArrayList<Integer>());
        }
        map.get(h).add(root.val);
        return h;
    }
    public List<List<Integer>> findLeaves(TreeNode root) {
        
       int h= height(root);
       List<List<Integer>> ans=new ArrayList<>();
       for(int i=1;i<=h;i++){
        ans.add(map.get(i));
       }
       return ans;
    }
}
