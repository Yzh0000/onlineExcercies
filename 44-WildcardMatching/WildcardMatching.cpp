class Solution {
public:
    bool isMatch(string s, string p) {
        int pstar=-1,pstarmatch=-1;
        int ps=0,pp=0;
        while(ps<s.size()){
            if(s[ps]==p[pp]||p[pp]=='?'){ps++;pp++;continue;}
            if(p[pp]=='*'){pstar=pp;pstarmatch=ps-1;pp++;continue;}
            if(pstar>=0){pp=pstar+1;pstarmatch++;ps=pstarmatch+1;continue;}
            return false;
        }
        while(p[pp]=='*')   pp++;
        return pp==p.size();
    }
};