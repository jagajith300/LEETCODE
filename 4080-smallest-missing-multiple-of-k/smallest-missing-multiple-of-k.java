class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int res=0;
        for(int i=k;i<102*k;i+=k){
            if(!s.contains(i)){
                res=i;
                break;
            }
        }
        return res;
    }
}