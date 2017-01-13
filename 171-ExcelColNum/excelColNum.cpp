class Solution {
public:
    int titleToNumber(string s) {
        int res=0;
        int tmp=1;
        for(int i=s.size()-1;i>=0;i--){
            res+=(s[i]-'A'+1)*tmp;
            tmp*=26;
        }
        return res;
    }
};