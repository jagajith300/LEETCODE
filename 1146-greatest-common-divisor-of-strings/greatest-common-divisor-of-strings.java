class Solution {
    public static int find_gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
       int a=str1.length();
       int b=str2.length(); 
       int gcd=find_gcd(a,b);
       String prefix=str1.substring(0,gcd);
       String check_1=prefix.repeat(a/gcd);
       String check_2=prefix.repeat(b/gcd);
       if(str1.equals(check_1)&&str2.equals(check_2)){
        return prefix;
       }
       return "";
    }
}