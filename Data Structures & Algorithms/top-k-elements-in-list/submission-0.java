class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->
        a[1]- b[1] );

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        for(int key:map.keySet()){
            q.offer(new int[]{key,map.get(key)});
            if(q.size()>k)q.poll();
        }

        int ans[]=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=q.poll()[0];
        }
        return ans;

        
    }
}
