class Solution {
    public boolean isAnagram(String s, String t) {
         int arr[]=new int[26];
         if(s.length()!=t.length())return false;

         for(int i=0;i<s.length();i++){
             char ss=s.charAt(i);
             char tt=t.charAt(i);
             arr[ss-'a']++;
             arr[tt-'a']--;
         }
         for(int i=0;i<26;i++){
            if(arr[i]!=0)return false;
         }
         return true;

    }
}
