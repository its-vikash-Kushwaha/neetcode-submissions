class Solution {
    public int rob(int[] nums) {
        int cur=0,prev=0;
        for(int x:nums){
            int temp=Math.max(cur,prev+x);
            prev=cur;
            cur=temp;
        }
        return cur;
    }
}
