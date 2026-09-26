class Solution {
    public static boolean is_vowel(char ch){
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
    public String reverseVowels(String s) {
        char[] arr=new char[s.length()];
        int k=0;
        for(int i=s.length()-1;i>=0;i--){
            if(is_vowel(s.charAt(i))){
                arr[k++]=s.charAt(i);
            }
        }
        int z=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(is_vowel(s.charAt(i))){
                res.append(arr[z++]);
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}