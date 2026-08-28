class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        int ans[]=new int[nums.length-k+1];
        for(int i=0;i<k;i++){
            p.add(nums[i]);

        }
        ans[0]=p.peek();
        int left=0;
        for(int right=k;right<nums.length;right++){
              p.remove(nums[left]);
              left++;
              p.add(nums[right]);
              ans[right-k+1]=p.peek();
        }
        return ans;
    }
}
