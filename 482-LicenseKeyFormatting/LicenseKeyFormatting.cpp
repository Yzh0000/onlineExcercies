class Solution {
public:
    string licenseKeyFormatting(string S, int K) {

        string res;
        int idx=S.size()-1;
        int counter=0;
        while(idx>=0){
            if(S[idx]=='-'){idx--;continue;}
            char c=toupper(S[idx]);
            res+=c;
            counter++;
            idx--;
            if(counter==K){res+='-';counter=0;}
        }
        if(res.empty()) return res;
        
        if(res.back()=='-') res.pop_back();
        reverse(res.begin(),res.end());
        return res;
    }
};