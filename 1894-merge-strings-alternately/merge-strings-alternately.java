class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        StringBuilder res=new StringBuilder();
        int k1=0;
        int k2=0;
        while(k1<n1||k2<n2){
            if(k1<n1){
                res.append(word1.charAt(k1++));
            }
            if(k2<n2){
                res.append(word2.charAt(k2++));
            }
        }System.out.println(res);
        return res.toString();
    }
}