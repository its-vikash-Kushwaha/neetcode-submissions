class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set=new HashSet<Character>();
        int len=0;

        int win=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(set.contains(ch)){

                
                while(s.charAt(win)!=ch){
                    set.remove(s.charAt(win));
                    win++;
                }
                 set.remove(s.charAt(win));
                    win++;


            }
                set.add(ch);
               len=Math.max(len,(i-win+1));
        }
        return len;
    }
}
