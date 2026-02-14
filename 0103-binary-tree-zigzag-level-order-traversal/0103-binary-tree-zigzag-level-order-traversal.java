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
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false;

        q.add(root);

        while(!q.isEmpty()){

            int count = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0; i<count; i++){
                TreeNode curr = q.poll();

                if(reverse){
                    s.push(curr.val);
                }else{
                    level.add(curr.val);
                }

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                 
                }

                if(reverse){
                    while(!s.isEmpty()){
                        level.add(s.pop());
                    }
                }

                result.add(level);
                reverse = !reverse;
            }
        

    return result;
    

    }
}