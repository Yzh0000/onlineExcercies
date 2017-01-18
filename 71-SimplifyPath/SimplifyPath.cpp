class Solution {
public:
    string simplifyPath(string path) {
        stringstream ss(path);
        string s;
        string res;
        vector<string> stk;
        while(getline(ss,s,'/')){
            if(s==""||s==".")   continue;
            if(s==".."&&!stk.empty()) stk.pop_back();
            else if(s!="..") stk.push_back(s);
        }
        for(auto s:stk) res+="/"+s;
        return res.empty()?"/":res;
    }
};