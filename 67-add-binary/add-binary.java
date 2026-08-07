class Solution {
    public String addBinary(String a, String b) {
        int m=a.length()-1;
        int n=b.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder(); 
        while(m>=0||n>=0||carry==1)
        {
            if(m>=0){
                carry+=Character.getNumericValue(a.charAt(m--));
            }
            if(n>=0){
                carry+=Character.getNumericValue(b.charAt(n--));
            }
            sb.append(carry%2);
            carry/=2;
        }
        return sb.reverse().toString();
    }
}