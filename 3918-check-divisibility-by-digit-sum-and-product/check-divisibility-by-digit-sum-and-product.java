class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int dup=n;
        while(dup>0){
            product*=dup%10;
            sum+=dup%10;
            dup/=10;
        }
        if((n%(product+sum))==0){
            return true;
        }
        return false;
    }
}