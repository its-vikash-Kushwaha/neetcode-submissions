class Solution {
    public int maxArea(int[] heights) {
        
        int ans=Integer.MIN_VALUE;
        int left=0;
        int right=heights.length-1;

        while(left<right){

            int w=right-left;

            int h=Math.min(heights[left],heights[right]);

            int area=w*h;
            ans=Math.max(area,ans);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
