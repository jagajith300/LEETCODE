class Solution {
    public int scoreOfString(String str) {
        int sum=0;
        char[] s=str.toCharArray();
        for(int i=0;i<s.length-1;i++){
            sum+=Math.abs((int)s[i]-(int)s[i+1]);
        }return sum;
    }
}