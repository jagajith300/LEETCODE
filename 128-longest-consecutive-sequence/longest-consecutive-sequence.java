class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        // System.out.println(max_count);
        int max_count=0;
        for(int i:hm.keySet()){
            if(!hm.containsKey(i-1)){
            int count=1;
            int t=i+1;
            while(hm.containsKey(t++)){
                count++;
            }
            max_count=Math.max(max_count,count);}
        }
        // System.out.println(max_count);
        return max_count;
    }
}