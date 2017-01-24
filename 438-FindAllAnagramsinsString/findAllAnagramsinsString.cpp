class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> res;
        vector<int> mp(128);
        int counter=p.size();
        for(char c:p)   mp[c]++;
        int begin=0,end=0;
        
        while(end<s.size()){
            if(mp[s[end++]]-->0)  counter--;
            while(counter==0){
                if(end-begin==p.size()) res.push_back(begin);
                if(mp[s[begin++]]++==0) counter++;
            }
        }
        return res;
    }
};