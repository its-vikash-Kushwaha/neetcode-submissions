class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();

        int len=0;
        for(int i:nums){
            set.add(i);
        }

        for(int i:nums){

            if(!set.contains(i-1)){
                int l=1;
                int n=i+1;
                while(set.contains(n)){
                    l++;
                    n++;
                }
                len=Math.max(len,l);
            }
        }
        return len;
    }
}
