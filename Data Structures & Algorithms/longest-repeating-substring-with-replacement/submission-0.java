class Solution {
    public int characterReplacement(String s, int k) {
        
        int count[]=new int[26];

        int left=0;
        int maxfreq=0;
        int ans=0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            
            count[ch-'A']++;

            maxfreq=Math.max(maxfreq,count[ch-'A']);

            while((right-left+1)-maxfreq>k){
                count[s.charAt(left)-'A']--;
                left++;
            }

            ans=Math.max(ans,(right-left+1));

        }
        return ans;
    }
}
