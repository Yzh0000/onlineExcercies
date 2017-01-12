class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        vector<int> mp(128);
        for(char c:magazine)    mp[c]++;
        for(char c:ransomNote){
            mp[c]--;
            if(mp[c]<0) return false;
        }
        return true;
    }
};