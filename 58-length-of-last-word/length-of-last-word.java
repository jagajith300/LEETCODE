class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
        s=s.trim();
        System.out.println(s);
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                break;
            }else{
                l++;
            }
        }
        return l;
    }
}