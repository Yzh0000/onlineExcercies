class Solution {
public:
    string minWindow(string s, string t) {
        vector<int> mp(128);
        for(char c:t)   mp[c]++;
        int begin=0,end=0,head=0,d=INT_MAX,count=t.size();
        string res;
        while(end<s.size()){
            if(mp[s[end++]]-->0)    count--;
            while(count==0){
                if(end-begin<d)  d=end-(head=begin);
                if(mp[s[begin++]]++==0)    count++;
            }
        }
        return d==INT_MAX?"":s.substr(head,d);
    }
};