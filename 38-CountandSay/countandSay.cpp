class Solution {
public:
    string countAndSay(int n) {
        if(n==0) return "";
        string res="1";
        
        for(int i=2;i<=n;i++){
            string cur="";
            
            for(int j=0;j<res.size();j++){
                int count=1;
                
                while(j+1<res.size()&&res[j+1]==res[j]){
                    count++;
                    j++;
                }
                cur+=to_string(count)+res[j];
            }
            res=cur;
        }
        return res;
    }
};