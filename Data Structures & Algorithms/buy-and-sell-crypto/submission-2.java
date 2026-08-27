class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int left=0;
        
         int minprice=Integer.MAX_VALUE;
        while(left<prices.length){
              minprice=Math.min(minprice,prices[left]);
              
              profit=Math.max(profit,(prices[left]-minprice));
              left++;
              
        }
        return profit;
    }
}
