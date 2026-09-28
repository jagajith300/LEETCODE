class Solution {
    public int maxDepth(String s) {
        // Stack<String>s=new Stack<>();
        int count=0;
        int max_count=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='('){
                count++;
            }if(ch==')'){
                max_count=Math.max(max_count,count--);
            }
        }return max_count;
    }
}