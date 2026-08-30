class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];
        for(int i:nums){
            if(i<=min){
                min=i;
            }if(i>=max){
                max=i;
            }
        }
        int min_index=0;
        int max_index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min){
                min_index=i;
            }
            if(nums[i]==max){
                max_index=i;
            }
        }
        // Find which index comes first and which comes second
int leftIndex = Math.min(min_index, max_index);
int rightIndex = Math.max(min_index, max_index);

// Scenario 1: Remove both from the front
int bothFromFront = rightIndex + 1;

// Scenario 2: Remove both from the back
int bothFromBack = n - leftIndex;

// Scenario 3: Remove left one from front, right one from back
int oppositeEnds = (leftIndex + 1) + (n - rightIndex);

// Return the smallest of the three scenarios
return Math.min(bothFromFront, Math.min(bothFromBack, oppositeEnds));
    }
}