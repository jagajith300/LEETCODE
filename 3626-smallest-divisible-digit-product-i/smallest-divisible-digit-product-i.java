class Solution {
    public static int product(int n)
    {
        int prod=1;
        while(n>0){
            prod*=n%10;
            n/=10;
        }
        // System.out.println(prod);
        return prod;
    }
    public int smallestNumber(int n, int t) {
        int res=n;
        for(int i=n;i<n+10;i++)
        {
            if(product(i)%t==0)
            {
                res=i;
                break;
            }
        }
        return res;
    }
}