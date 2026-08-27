class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
         int count[]=new int[26];
         int count2[]=new int[26];
        for(char c:s1.toCharArray()){
            
            count[c-'a']++;
        }

        int left=0;

        for(int right=0;right<s2.length();right++){
            char ch=s2.charAt(right);
            count2[ch-'a']++;

            while((right-left+1)>s1.length()){
                count2[s2.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(count,count2))return true;
        }

        
        return false;
    }
}
