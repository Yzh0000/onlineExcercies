class Solution {
public:
    int longestPalindrome(string s) {
        unordered_set<char> st;
        int res=0;
        for(char c:s){
            if(st.count(c)){
                res++;
                st.erase(c);
            }
            else    st.insert(c);
        }
        res*=2;
        if(res!=s.size())   res++;
        return res;
    }
};