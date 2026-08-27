class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int s=nums[0];
        int l=nums[0];
        List<Integer>al=new ArrayList<>();
        List<Integer>res=new ArrayList<>();
        for(int i:nums){
            al.add(i);
            if(i<=s){
                s=i;
            }else if(i>=l){
                l=i;
            }
        }
        for(int i=s;i<l;i++){
            if(al.contains(i)){
                continue;
            }else{
                res.add(i);
            }
        }
        return res;
    }
}