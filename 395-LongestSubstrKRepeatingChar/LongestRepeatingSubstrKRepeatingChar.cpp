class Solution {
public:
    int longestSubstring(string s, int k) {
        if(s.size() == 0 || k > s.size())   return 0;
        if(k == 0)  return s.size();
        
        unordered_map<char,int> mp;
        for(char c:s){
            mp[c]++;
        }
        
        for(int i=0;i<s.size();i++){
            if(mp[s[i]]<k){
                int left=longestSubstring(s.substr(0,i),k);
                int right=longestSubstring(s.substr(i+1),k);
                return max(left,right);
            }
        }
        
        return s.size();
    }
};