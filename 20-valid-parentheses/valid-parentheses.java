class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack();
        String check="{([";
        for(char ch:s.toCharArray())
        {
            if(check.indexOf(ch)!=-1){
                stack.push(ch);
            }
            else if(ch==']'||ch==')'||ch=='}')
            {
                if(stack.isEmpty()){
                    return false;
                }
                else if(ch==']'&&stack.peek()!='['||ch==')'&&stack.peek()!='('||ch=='}'&&stack.peek()!='{')
                {
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}