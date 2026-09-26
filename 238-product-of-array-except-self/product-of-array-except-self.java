class Solution {
    public int[] productExceptSelf(int[] nums) {
        int suffix[]=new int[nums.length];   
        int prefix[]=new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
            if(i==0){
                prefix[i]=nums[i];
            }else{
                prefix[i]=nums[i]*prefix[i-1];
            }
        }  
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                suffix[i]=nums[i];
            }else{
                suffix[i]=nums[i]*suffix[i+1];
            }
        }  
        for(int i=0;i<nums.length;i++){
            if(i==0){
                nums[i]=suffix[i+1];
            }
            else if(i==nums.length-1){
                nums[i]=prefix[i-1];
            }
            else{
                nums[i]=prefix[i-1]*suffix[i+1];
            }
        }
        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(suffix));
        return nums;
    }
}