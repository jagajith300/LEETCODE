class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] cache=new int[nums.length];
        Arrays.fill(cache,1);
        for(int i=nums.length-1;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
               if(nums[i]<nums[j]){
                cache[i]=Math.max(cache[i],1+cache[j]);
               } 
            }
        }
        int max=cache[0];
        for(int i:cache){
            max=Math.max(max,i);
        }return max;
    }
}