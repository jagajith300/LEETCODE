class Solution {
public:
    bool isValid(string s) {
       vector<char>st;
        for(int i=0;i<s.length();i++){
            if(s[i]=='{'||s[i]=='('||s[i]=='['){
                st.push_back(s[i]);
            }
            else{
                if(st.empty()){
                    return false;
                }
                if(s[i]=='}'&&st.back()!='{'||
                s[i]==']'&&st.back()!='['||
                s[i]==')'&&st.back()!='('
                ){
                    return false;
                }
                else{
                    st.pop_back();
                }
            }
        } if(st.empty()){
            return true;
        }return false;
    }
};