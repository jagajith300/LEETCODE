class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String>hm=new HashMap<>();
        for(int i=0;i<knowledge.size();i++)
        {
            hm.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
            {
                int start=i;
                int end=i;
                while(s.charAt(end)!=')'){
                    end++;
                }
                String key=s.substring(start+1,end);
                if(hm.containsKey(key)){
                    res.append(hm.get(key));
                }else{
                    res.append("?");
                }
                i=end;
            }
            else
            {
                res.append(ch);
            }
        }
        return res.toString();
    }
}