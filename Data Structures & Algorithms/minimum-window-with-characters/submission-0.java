class Solution {
    public String minWindow(String s, String t) {
        int countT[]=new int[128];
        int countW[]=new int[128];

        int left=0;
        int start=0;

        int need=0;
        int have=0;

        for(char c:t.toCharArray()){
            countT[c]++;
        }
        for(int i=0;i<128;i++){
            if(countT[i]>0)need++;
        }
           int minL=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){

            char c=s.charAt(right);
            countW[c]++;

            if(countT[c]>0 && countT[c]==countW[c]){
                have++;
            }

            while(need==have){

                if((right-left+1)<minL){
                    minL=right-left+1;
                    start=left;
                }

                char cl=s.charAt(left);
                countW[cl]--;

                if(countT[cl]>0 && countW[cl]<countT[cl]){
                    have--;
                }
                left++;
            }


        }

        if(minL==Integer.MAX_VALUE)return "";
        return s.substring(start,start+minL);
    }
}
